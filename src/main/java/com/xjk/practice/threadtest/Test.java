package com.xjk.practice.threadtest;

/**
 * @date: 2016/07/22
 * @author: xujinkai
 */

public class Test {

    public static void main(String[] args) {

        Bank b = new Bank(100.00);

        for (int i = 0; i < 100; i++) {

                Transfer t = new Transfer(b, i);

                Thread a = new Thread(t);

                 System.out.println("----"+i);
                 a.start();
                 System.out.println("------"+i);

        }

    }

}
