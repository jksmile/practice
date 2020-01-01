package com.xjk.practice.threadtest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @date: 2016/09/28
 * @author: xujinkai
 */

public class ThreadPoolTest {


    private final ScheduledExecutorService
            pollExecutor = Executors.newScheduledThreadPool(1, new NamedThreadFactory("registry-poll-thread", true));

    public static void main(String[] args) {



    }

}
