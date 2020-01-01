package com.xjk.practice.threadtest;

/**
 * @date: 2016/07/22
 * @author: xujinkai
 */

public class Test {

    public static void main(String[] args) {

        LogCache logA = new LogCache("AAA");

        Thread tha = new Thread(logA,"a");

        Thread thb = new Thread(logA,"b");

        tha.start();

        thb.start();


    }

}
