package com.xjk.practice.integertest;

/**
 * @date: 2016/05/25
 * @author: xujinkai
 */

public class Test {

    public static void main(String[] args) {

//        double x = 10.2;
//
//        System.out.println(x);
//
//        int y =(int) (x*100);
//        int a = new BigDecimal(y).divide(new BigDecimal(12), 0, BigDecimal.ROUND_UP).intValue();
//
//        int b = y-11*a;


        testValueOf();
    }


    public static void testValueOf(){


        Integer a = Integer.valueOf("10");


        Integer b = Integer.valueOf("10");

        if(a == b){

            System.out.println("OK");
        }



        Integer x = 100;

        Integer y = 100;

        x += 1;

        System.out.println(x+"---"+y);

        if(x == y){

            x++;


            System.out.println("OK");

            System.out.println(x);

            System.out.println(y);
        }

    }


}
