package com.tmm.mall.support.interceptor;

import com.tmm.mall.support.annotation.IgnoreLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author： tangmingming
 * @Date: 2020-10-28 11:01
 * @Version： 1.0
 */

public abstract class AbstractInterceptor {

    private static ConcurrentHashMap<String, Method> methodCache = new ConcurrentHashMap<>();

    protected boolean ignoreLog(ProceedingJoinPoint pjp) throws NoSuchMethodException{
        Class<?> targetClass = pjp.getTarget().getClass();
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        String methodName = targetClass.getSimpleName() + "." + signature.getMethod().getName();
        Method method = methodCache.get(methodName);
        if (method == null){
            method = pjp.getTarget().getClass().getDeclaredMethod(signature.getName(), signature.getMethod().getParameterTypes());
            methodCache.put(methodName, method);
            method = methodCache.get(methodName);
        }
        return method.getAnnotation(IgnoreLog.class) != null;
    }
}
