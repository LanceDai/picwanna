package com.design.picwanna.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * className: Const
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-19
 */
@Component
@PropertySource({"classpath:config.properties"})
public class Consts {
    @Value("${test}")
    public String test;
}
