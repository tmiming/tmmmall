package com.tmm.mall.service.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tmm.mall.support.exception.CheckException;
import com.tmm.mall.support.exception.SystemException;
import com.tmm.mall.support.interceptor.AbstractInterceptor;
import com.tmm.mall.support.logger.CheckLogger;
import com.tmm.mall.support.logger.ServiceLogger;
import com.tmm.mall.support.logger.SystemLogger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Author： tangmingming
 * @Date: 2020-10-28 11:14
 * @Version： 1.0
 */

@Component
@Aspect
@Lazy(false)
public class ServiceInterceptor extends AbstractInterceptor {

    @Around("execution(public * com.tmm.mall.service.impl.*ServiceImpl.*(..))")
    public Object aroundProcess(final ProceedingJoinPoint pjp) throws Throwable{
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        return invoke(pjp, signature).getResult();
    }

    private InvokeResponse invoke(ProceedingJoinPoint pjp, MethodSignature signature) throws Throwable{
        Class<?> targetClass = pjp.getTarget().getClass();
        String methodName = targetClass.getSimpleName() + "." + signature.getMethod().getName();
        Exception exception = null;
        Object result = null;

        long startTime = System.currentTimeMillis();
        long elapseTime = 0;
        try{
            result = pjp.proceed();
            elapseTime = System.currentTimeMillis() - startTime;
            if (!ignoreLog(pjp)){
                ServiceLogger.info("success: true, api:%s, elapseTime:%d, param:%s, result:%s, message:N/A", methodName, elapseTime, toParamString(pjp), JSON.toJSONString(result));
            }
        }catch (CheckException e){
            exception = e;
            elapseTime = System.currentTimeMillis() - startTime;
            CheckLogger.error(e, "execute %s failed, elapseTime:%d, param:%s, message:%s", methodName, elapseTime, toParamString(pjp), e.getMessage());
        }catch(SystemException e){
            exception = e;
            elapseTime = System.currentTimeMillis() - startTime;
            SystemLogger.error(e, "execute %s failed, elapseTime:%d, param:%s, message:%s", methodName, elapseTime, toParamString(pjp), e.getMessage());
        } catch (Throwable e){
            throw e;
        }
        return new InvokeResponse(result, exception, elapseTime,signature.getMethod().getName());
    }

    private String toParamString(ProceedingJoinPoint pjp){
        JSONArray params = new JSONArray();
        if (pjp.getArgs().length > 0){
            for (Object arg : pjp.getArgs()) {
                JSONObject param = (JSONObject) JSON.toJSON(arg);
                params.add(param);
            }
        }
        return params.toJSONString();
    }

    private static class  InvokeResponse<T>{

        private Boolean success;
        private Object result;
        private Exception exception;
        private Long elapseTime;
        private String methodName;

        public InvokeResponse(Object result, Exception exception, Long elapseTime, String methodName){
            this.success = (exception != null);
            this.result = result;
            this.exception = exception;
            this.elapseTime = elapseTime;
            this.methodName = methodName;
        }

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Object getResult() {
            return result;
        }

        public void setResult(Object result) {
            this.result = result;
        }

        public Exception getException() {
            return exception;
        }

        public void setException(Exception exception) {
            this.exception = exception;
        }

        public Long getElapseTime() {
            return elapseTime;
        }

        public void setElapseTime(Long elapseTime) {
            this.elapseTime = elapseTime;
        }

        public String getMethodName() {
            return methodName;
        }

        public void setMethodName(String methodName) {
            this.methodName = methodName;
        }
    }
}
