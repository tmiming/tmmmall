package com.tmm.mall.support.thread;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author： tangmingming
 * @Date: 2020-11-02 11:05
 * @Version： 1.0
 */

public abstract class BaseThreadManager {

    private ExecutorService executor;

    public ExecutorService getExecutor(){
        return this.executor;
    }

    /**
     * 核心线程池大小
     */
    public abstract int getCorePoolSize();


    /**
     * 线程池最大线程数
     * @return
     */
    public abstract int getMaxCorePoolSize();


    /**
     * 空闲线程存留时间
     * @return
     */
    public abstract  long getKeepAliveMillis();

    /**
     * 线程队列
     * @return
     */
    public abstract BlockingQueue<Runnable> getWorkQueue();

    /**
     * 线程工厂
     * @return com.google.common.util.concurrent.ThreadFactoryBuilder
     */
    public abstract ThreadFactory getThreadFactory();


    /**
     * 拒绝策略
     * @return
     */
    public abstract RejectedExecutionHandler getHandler();


    /**
     * 线程超时是否回收
     * @return
     */
    public abstract boolean getAllowCoreThreadTimeout();

    public synchronized void initPool(){
        if (executor != null){
            executor.shutdown();
        }
        executor = ExecutorBuilder.create()
                .setCorePoolSize(getCorePoolSize())
                .setMaxPoolSize(getMaxCorePoolSize())
                .setKeepAliveTime(getKeepAliveMillis())
                .setThreadFactory(getThreadFactory())
                .setWorkQueue(getWorkQueue())
                .setHandler(getHandler())
                .setAllowCoreThreadTimeout(getAllowCoreThreadTimeout())
                .build();
    }

    public boolean isShowdown(){
        if(executor == null){
            return true;
        }
        return false;
    }

    public synchronized void showdownPool(boolean now){
        if (executor == null){
            return;
        }
        if (now){
            executor.shutdownNow();
        }
        executor.shutdown();
    }

    public <T> Future<T> submit(Callable<T> task) {
        return executor.submit(task);
    }

    public <T> Future<T> submit(Runnable task, T result) {
        return executor.submit(task, result);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return executor.invokeAll(tasks);
    }



}
