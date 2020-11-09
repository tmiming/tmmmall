package com.tmm.mall.support.utils;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.ThreadFactory;

/**
 * @Author： tangmingming
 * @Date: 2020-11-02 16:08
 * @Version： 1.0
 */

public class ThreadUtils {

    public static ThreadFactory newThreadFactory(String nameFormat,
                                                 Boolean deamon,
                                                 int priority,
                                                 Thread.UncaughtExceptionHandler handler,
                                                 ThreadFactory threadFactory){
        return new ThreadFactoryBuilder()
                .setNameFormat(nameFormat)
                .setDaemon(deamon)
                .setPriority(priority)
                .setUncaughtExceptionHandler(handler)
                .build();
    }

    public static ThreadFactory newThreadFactory(String nameFormat, Boolean daemon){
        return new ThreadFactoryBuilder()
                .setNameFormat(nameFormat)
                .setDaemon(daemon)
                .build();
    }

    /**
     * 构建线程工厂
     * @param nameFormat
     * @return
     */
    public static ThreadFactory newThreadFactory(String nameFormat){
        return new ThreadFactoryBuilder().setNameFormat(nameFormat).build();
    }


    /**
     * 默认线程池大小
     * @return
     */
    public static int getDefaultCorePoolSize(){
        return Runtime.getRuntime().availableProcessors();
    }

}
