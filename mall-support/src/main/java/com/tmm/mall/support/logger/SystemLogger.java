package com.tmm.mall.support.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.tmm.mall.support.message.MessageFormatter.build;

/**
 * @Author： tangmingming
 * @Date: 2020-10-27 17:30
 * @Version： 1.0
 */

public class SystemLogger {

    private static final Logger LOG = LoggerFactory.getLogger(SystemLogger.class);

    public static void info(String format, Object... args){
        LOG.info(build(format, args));
    }

    public static void error(String format, Object... args){
        LOG.error(build(format, args));
    }

    public static void error(Throwable cause,String format, Object... args){
        LOG.error(build(format, args), cause);
    }
}
