package com.tmm.mall.support.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author： tangmingming
 * @Date: 2020-10-28 16:12
 * @Version： 1.0
 */

public class SpringContextHolder implements ApplicationContextAware, DisposableBean {
    private static ApplicationContext applicationContext;

    @Override
    public void destroy() throws Exception {
        SpringContextHolder.applicationContext = null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        if (SpringContextHolder.applicationContext != null){
            return SpringContextHolder.applicationContext;
        }
        throw  new RuntimeException("SpringContextHolder.applicationContext is null");
    }

    public static <T> T getBean(Class<T> clazz){
        if (SpringContextHolder.applicationContext != null){
            return SpringContextHolder.applicationContext.getBean(clazz);
        }
        throw  new RuntimeException("SpringContextHolder.applicationContext is null");
    }
}
