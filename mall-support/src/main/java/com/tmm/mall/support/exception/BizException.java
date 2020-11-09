package com.tmm.mall.support.exception;

import com.tmm.mall.support.message.MessageFormatter;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 17:15
 * @Version： 1.0
 */

public class BizException extends BaseException {

    public BizException(){}

    public BizException(String message, Object... args){
        super(MessageFormatter.build(message, args));
    }

    public BizException(Throwable cause, String message, Object... args){
        super(cause, message, args);
    }

    public BizException(Throwable cause){
        super(cause);
    }

}
