package com.tmm.mall.support.exception;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 17:53
 * @Version： 1.0
 */

public class CheckException extends BaseException {

    public CheckException(){}

    public CheckException(String message, Object... args){
        super(message, args);
    }

    public CheckException(Throwable cause, String message, Object... args){
        super(cause, message, args);
    }

    public CheckException(Throwable cause){
        super(cause);
    }

}
