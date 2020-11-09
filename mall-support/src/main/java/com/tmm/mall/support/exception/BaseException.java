package com.tmm.mall.support.exception;

import com.tmm.mall.support.message.MessageFormatter;

/**
 * @Author： tangmingming
 * @Date: 2020-10-26 17:45
 * @Version： 1.0
 */

public class BaseException extends RuntimeException{

    public BaseException(){}

    public BaseException(String message, Object... args){
        super(MessageFormatter.build(message, args));
    }

    public BaseException(Throwable cause, String message, Object... args){
        super(MessageFormatter.build(message, args), cause);
    }

    public BaseException(Throwable cause){
        super(cause);
    }
}
