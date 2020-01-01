package com.xjk.practice.test;

/**
 * @date: 2016/09/14
 * @author: xujinkai
 */

public class ImplA extends BaseA{

    public ImplA() {

        super();
    }

    @Override
    protected void sayName(){

        System.out.println("ImplA");

    }

    @Override
    protected void sayHi() {

        System.out.println("ImplA say hi.");
    }

    public static void main(String[] args) {

        System.out.println(Math.floor(4.5));

        BaseA a = new ImplA();

        a.sayName();

        a.sayHi();

    }
}
