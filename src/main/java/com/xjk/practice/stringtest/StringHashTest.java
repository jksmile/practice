package com.xjk.practice.stringtest;

/**
 * @date: 2016/09/01
 * @author: xujinkai
 */

public class StringHashTest {

    public static void main(String[] args) {

        stringTest();

        newStringTest();

        stringAndNewStringTest();

    }

    public static void stringTest(){

        System.out.println("String test start...");

        String a = "test";

        String b = "test";

        compareObj(a,b);

        System.out.println("---------------------");

    }

    public static void newStringTest(){

        System.out.println("String by new test start...");

        String a = new String("test");

        String b = new String("test");

        compareObj(a,b);

        System.out.println("---------------------");


    }


    public static void stringAndNewStringTest(){

        System.out.println("String and string by new test start...");

        String a = "test";

        String b = new String("test");

        compareObj(a,b);

        System.out.println("---------------------");

    }


    public static void compareObj(String a, String b){

        System.out.println(a.hashCode());

        System.out.println(b.hashCode());

        System.out.println(a == b);

        System.out.println(a.equals(b));
    }


}
