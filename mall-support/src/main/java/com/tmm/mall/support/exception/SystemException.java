package com.tmm.mall.support.exception;

import com.tmm.mall.support.message.MessageFormatter;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 17:07
 * @Version： 1.0
 */

public class SystemException extends BaseException {

    public SystemException(){}

    public SystemException(String message, Object... args){
        MessageFormatter.build(message, args);
    }

    public SystemException(Throwable cause, String message, Object... args){
        super(cause, message, args);
    }

    public SystemException(Throwable cause){
        super(cause);
    }
}
