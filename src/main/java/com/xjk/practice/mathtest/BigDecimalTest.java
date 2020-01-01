package com.xjk.practice.mathtest;

import java.math.BigDecimal;

/**
 * @date: 2016/08/01
 * @author: xujinkai
 */

public class BigDecimalTest {

    public static void main(String[] args) {

        System.out.println(-10 >> 1);

        System.out.println(-10 >>> 1);
    }



    public static void test(){

        BigDecimal dividend = new BigDecimal("100");

        BigDecimal divisor = new BigDecimal("30");

        BigDecimal result =  dividend.divide(divisor,1000,BigDecimal.ROUND_UP);

        System.out.println(result.toString());

        System.out.println(result.multiply(new BigDecimal("10")).toString());

        System.out.println(result.toString().length());
    }

    public static void test1(){

        BigDecimal zero = BigDecimal.ZERO;

        System.out.println(zero.toString());


        BigDecimal a = new BigDecimal("199.02");

        System.out.println(a.toString());

        System.out.println(a.signum());

        BigDecimal b = new BigDecimal("199.00000000000002");

        System.out.println(b.toString());
    }



}
