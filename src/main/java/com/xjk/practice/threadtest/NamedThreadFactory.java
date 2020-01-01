package com.xjk.practice.threadtest;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @date: 2016/09/28
 * @author: xujinkai
 */
public class NamedThreadFactory implements ThreadFactory {

    private static final AtomicInteger POOL_SEQ = new AtomicInteger(1);

    private final AtomicInteger threadNum = new AtomicInteger(1);

    private final String prefix;

    private final boolean daemon;

    private final ThreadGroup group;

    public NamedThreadFactory() {
        this("pool-" + POOL_SEQ.getAndIncrement(), false);
    }

    /**
     * Create a NamedThreadFactory
     * @param prefix prefix of thread name
     */
    public NamedThreadFactory(String prefix) {
        this(prefix, false);
    }

    /**
     * Create a NamedThreadFactory
     *
     * @param prefix prefix of thread name
     * @param daemon is thread daemon
     */
    public NamedThreadFactory(String prefix, boolean daemon) {
        this.prefix = prefix + "-thread-";
        this.daemon = daemon;
        SecurityManager s = System.getSecurityManager();
        this.group = (s == null) ? Thread.currentThread().getThreadGroup() : s.getThreadGroup();
    }

    public Thread newThread(Runnable runnable) {
        String name = this.prefix + this.threadNum.getAndIncrement();
        Thread ret = new Thread(this.group, runnable, name, 0);
        ret.setDaemon(this.daemon);
        return ret;
    }

    public ThreadGroup getThreadGroup() {
        return this.group;
    }
}

