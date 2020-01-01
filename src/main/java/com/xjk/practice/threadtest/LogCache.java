package com.xjk.practice.threadtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xujinkai
 * @date 2017/01/24
 */

public class LogCache implements Runnable {

    private String msg;

    public LogCache(String msg) {

        this.msg = msg;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        for (int i = 0; i < 3; i++) {

            addCache(msg + "----" + i + "----" + threadName);

        }



        if(threadName.equals("a")){

            try {
                Thread.sleep(1000);

                System.out.println(threadName + "--" +THREAD_LOCAL_LOG.get().toString());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println(threadName + "--" +THREAD_LOCAL_LOG.get().toString());
        }



    }

    private static ThreadLocal<List<String>> THREAD_LOCAL_LOG = new ThreadLocal<>();

    public static void addCache(String msg) {

        if (null == THREAD_LOCAL_LOG.get() || THREAD_LOCAL_LOG.get().size() <= 0) {

            List<String> logList = new ArrayList<>();

            logList.add(msg);

            THREAD_LOCAL_LOG.set(logList);

        } else {

            List<String> logList = THREAD_LOCAL_LOG.get();

            logList.add(msg);

            THREAD_LOCAL_LOG.set(logList);
        }

    }

}