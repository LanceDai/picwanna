package com.design.picwanna.config;

import com.alibaba.fastjson.JSON;
import com.design.picwanna.entity.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.DefaultSessionKey;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * className: KickoutSessionControlFilter
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-19
 */
@Data
@Slf4j
public class KickoutSessionControlFilter extends AccessControlFilter {
    private String kickoutUrl;
    private boolean kickoutAfter = false;
    private int maxSession = 1;
    private SessionManager sessionManager;
    private Cache<String, Deque<Serializable>> cache;

    public void setCacheManager(CacheManager cacheManager) {
        this.cache = cacheManager.getCache("shiro_redis_cache");
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        Subject subject = getSubject(servletRequest, servletResponse);
        if (!subject.isAuthenticated() && !subject.isRemembered()) {
            //直接进行下一步
            return true;
        }

        Session session = subject.getSession();
        String username = (String) subject.getPrincipal();
        log.info(username);
        Serializable sessionId = session.getId();

        //读取缓存, 没有就存入
        Deque<Serializable> deque = cache.get(username);

        if (deque == null) {
            deque = new LinkedList<Serializable>();
        }

        //队列里没有这个sessionId,且用户没有被踢,则放入队列
        if (!deque.contains(sessionId) && session.getAttribute("kickout") == null) {
            //存入队列
            deque.push(sessionId);
            //将用户的sessionId队列缓存
            cache.put(username, deque);
        }

        while (deque.size() > maxSession) {
            Serializable kickoutSessionId = null;
            //踢人
            if (kickoutAfter) {
                kickoutSessionId = deque.removeFirst();
                cache.put(username, deque);
            } else {
                kickoutSessionId = deque.removeLast();
                cache.put(username, deque);
            }

            try{
                Session kickoutSession = sessionManager.getSession(new DefaultSessionKey(kickoutSessionId));
                if (kickoutSession != null){
                    //设置Session属性表示被踢了
                    kickoutSession.setAttribute("kickout", true);
                }
            }catch (Exception e){

            }
        }
        if (session.getAttribute("kickout") != null){
            //被踢了
            try{
                subject.logout();
            }catch (Exception e){

            }

            saveRequest(servletRequest);

            Map<String, String> resultMap = new HashMap<>(16);
            if ("XMLHttpRequest".equalsIgnoreCase(((HttpServletRequest) servletRequest).getHeader("X-Requested-With"))) {
                resultMap.put("user_status", "300");
                resultMap.put("message", "您已经在其他地方登录，请重新登录！");
                //输出json串
//                out(servletResponse, resultMap);
                WebUtils.issueRedirect(servletRequest, servletResponse, kickoutUrl);
            }else{
                //重定向
                WebUtils.issueRedirect(servletRequest, servletResponse, kickoutUrl);
            }
            return false;
        }
        return true;
    }

    private void out(ServletResponse hresponse, Map<String, String> resultMap)
            throws IOException {
        try {
            hresponse.setCharacterEncoding("UTF-8");
            PrintWriter out = hresponse.getWriter();
            out.println(JSON.toJSONString(resultMap));
            out.flush();
            out.close();
        } catch (Exception e) {
            System.err.println("KickoutSessionFilter.class 输出JSON异常，可以忽略。");
        }
    }
}
