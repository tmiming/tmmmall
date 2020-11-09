package com.tmm.mall.support.exception;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 17:45
 * @Version： 1.0
 */

public class ServiceException extends BaseException {

    public ServiceException(){}

    public ServiceException(String message, Object... args){
        super(message, args);
    }

    public ServiceException(Throwable cause, String message, Object... args){
        super(cause, message, args);
    }

    public ServiceException(Throwable cause){
        super(cause);
    }

}
