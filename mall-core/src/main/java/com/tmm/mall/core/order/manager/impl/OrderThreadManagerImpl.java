package com.tmm.mall.core.order.manager.impl;

import com.tmm.mall.core.order.manager.OrderThreadManager;
import com.tmm.mall.support.thread.BaseThreadManager;
import com.tmm.mall.support.utils.ThreadUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.*;

/**
 * @Author： tangmingming
 * @Date: 2020-11-02 16:03
 * @Version： 1.0
 */

@Service
public class OrderThreadManagerImpl extends BaseThreadManager implements OrderThreadManager, ApplicationListener<ContextClosedEvent> {

    private static final String THREAD_NAME_PATTERN = "order-thread-%d";

    @PostConstruct
    public void init(){initPool();}

    @Override
    public int getCorePoolSize() {
        return ThreadUtils.getDefaultCorePoolSize();
    }

    @Override
    public int getMaxCorePoolSize() {
        return getCorePoolSize() * 2;
    }

    @Override
    public long getKeepAliveMillis() {
        return DateUtils.MILLIS_PER_MINUTE;
    }

    @Override
    public BlockingQueue<Runnable> getWorkQueue() {
        return new LinkedBlockingQueue();
    }

    @Override
    public ThreadFactory getThreadFactory() {
        return ThreadUtils.newThreadFactory(THREAD_NAME_PATTERN);
    }

    @Override
    public RejectedExecutionHandler getHandler() {
        return new ThreadPoolExecutor.AbortPolicy();
    }

    @Override
    public boolean getAllowCoreThreadTimeout() {
        return true;
    }

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        if (!isShowdown()){
            showdownPool(false);
        }
    }
}
