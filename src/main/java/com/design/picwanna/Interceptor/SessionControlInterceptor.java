package com.design.picwanna.Interceptor;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import sun.rmi.runtime.NewThreadAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * className: SessionControlInterceptor
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-19
 */

public class SessionControlInterceptor extends HandlerInterceptorAdapter {
    private JedisPool jedisPool;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        //如果没有登录
        if (!subject.isAuthenticated()) {
            return true;
        }
        Jedis jedis = null;
        String kickoutlogin = null;
        try {
            //获取请求的SessionId
            String sessionId = request.getSession().getId();
            jedis = jedisPool.getResource();
            //获取被踢出的SessionId
            String jessionId=jedis.get("Ks");
            if (sessionId != null) {
                //做判断 容易空指针
                if (null != jessionId) {
                    //获取这次请求SessionId 的标识
                    kickoutlogin = jedis.hget("kickoutSessionId", jessionId);
                }
            }

            if (kickoutlogin != null) {
                //标记为 false 并且 该 次请求的sessionId 和踢出的SessionId 相同
                if (kickoutlogin.equals("false") && sessionId.equals(jessionId)) {
                    //退出
                    subject.logout();
                    //重定向
                    WebUtils.issueRedirect(request, response, "kickoutLogin");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return Boolean.TRUE;
    }
}
