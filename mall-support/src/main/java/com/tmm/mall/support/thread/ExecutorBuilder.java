package com.tmm.mall.support.thread;

import java.io.Serializable;
import java.util.concurrent.*;

/**
 * @Author： tangmingming
 * @Date: 2020-11-02 14:21
 * @Version： 1.0
 */

public class ExecutorBuilder implements Serializable {


    private int corePoolSize = 0;

    private int maxPoolSize = Integer.MAX_VALUE;

    private long keepAliveTime = TimeUnit.SECONDS.toMillis(60);

    private BlockingQueue<Runnable> workQueue;

    private ThreadFactory threadFactory;

    private RejectedExecutionHandler handler;

    private Boolean allowCoreThreadTimeout;

    public ExecutorBuilder setCorePoolSize(int corePoolSize){
        this.corePoolSize = corePoolSize;
        return this;
    }

    public ExecutorBuilder setMaxPoolSize(int maxPoolSize){
        this.maxPoolSize = maxPoolSize;
        return this;
    }

    public ExecutorBuilder setKeepAliveTime(long keepAliveTime){
        this.keepAliveTime = keepAliveTime;
        return this;
    }

    public ExecutorBuilder setWorkQueue(BlockingQueue<Runnable> workQueue){
        this.workQueue = workQueue;
        return this;
    }

    public ExecutorBuilder useLinkedBlockQueue(){
        setWorkQueue(new LinkedBlockingQueue<>());
        return this;
    }

    public ExecutorBuilder useArrayBlockQueue(int capacity){
        setWorkQueue(new ArrayBlockingQueue<>(capacity));
        return this;
    }

    public ExecutorBuilder useSynchonousQueue(boolean fair){
        setWorkQueue(new SynchronousQueue<>(fair));
        return this;
    }

    public ExecutorBuilder usePriorityQueue(){
        setWorkQueue(new PriorityBlockingQueue<>());
        return this;
    }

    public ExecutorBuilder setThreadFactory(ThreadFactory threadFactory){
        this.threadFactory = threadFactory;
        return this;
    }

    public ExecutorBuilder setAllowCoreThreadTimeout(Boolean allowCoreThreadTimeout){
        this.allowCoreThreadTimeout = allowCoreThreadTimeout;
        return this;
    }

    public ExecutorBuilder setHandler(RejectedExecutionHandler handler){
        this.handler = handler;
        return this;
    }

    public static ExecutorBuilder create(){
        return new ExecutorBuilder();
    }

    public ThreadPoolExecutor build(){
        return build(this);
    }

    public static ThreadPoolExecutor build(ExecutorBuilder builder){
        final int corePoolSize = builder.corePoolSize;
        final int maxPoolSize = builder.maxPoolSize;
        final long keepAliveTime = builder.keepAliveTime;
        final BlockingQueue<Runnable> workQueue;
        if (builder.workQueue != null){
            workQueue = builder.workQueue;
        }else{
            workQueue = builder.useLinkedBlockQueue().workQueue;
        }
        final ThreadFactory threadFactory = builder.threadFactory == null ? Executors.defaultThreadFactory() : builder.threadFactory;
        RejectedExecutionHandler handler = builder.handler == null ? new ThreadPoolExecutor.AbortPolicy() : builder.handler;
        final ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.MILLISECONDS,
                workQueue,
                threadFactory,
                handler);
        if (builder.allowCoreThreadTimeout != null){
            poolExecutor.allowCoreThreadTimeOut(builder.allowCoreThreadTimeout);
        }
        return poolExecutor;
    }
}
