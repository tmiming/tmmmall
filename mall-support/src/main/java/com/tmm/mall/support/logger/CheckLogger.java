package com.tmm.mall.support.logger;

import com.tmm.mall.support.message.MessageFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 17:26
 * @Version： 1.0
 */

public class CheckLogger {

    private static final Logger LOG = LoggerFactory.getLogger(CheckLogger.class);

    public static void error(String format, Object... args){
        LOG.error(MessageFormatter.build(format, args));
    }

    public static void error(Throwable cause, String format, Object... args){
        LOG.error(MessageFormatter.build(format, args), cause);
    }

}
