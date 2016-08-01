package com.xjk.practice.mathtest;

import java.math.BigDecimal;

/**
 * @date: 2016/04/23
 * @author: xujinkai
 */

public class SignumTest {


    public static void main(String[] args) {


        double x = 50.12;

        double y = -3.21;

        double z = 0.00;

        System.out.println(Math.signum(x));

        System.out.println(Math.signum(y));

        System.out.println(Math.signum(z));

//        1.0
//       -1.0
//        0.0


        System.out.println("-------------------");


        int a = 10;

        int b = -4;

        int c = 0;

        System.out.println(Math.signum(a));

        System.out.println(Math.signum(b));

        System.out.println(Math.signum(c));

//        1.0
//       -1.0
//        0.0
//
        System.out.println("-------------------");


        BigDecimal  o = new BigDecimal("20");

        BigDecimal  p = new BigDecimal("-10");

        BigDecimal  q = new BigDecimal("0");

        System.out.println(o.signum());

        System.out.println(p.signum());

        System.out.println(q.signum());

        //        1
        //       -1
        //        0


        System.out.println("-------------------");


        BigDecimal  r = new BigDecimal("8.22");

        BigDecimal  s = new BigDecimal("-2.23");

        BigDecimal  t = new BigDecimal("0.00");

        System.out.println(r.signum());

        System.out.println(s.signum());

        System.out.println(t.signum());

//        1
//       -1
//        0

        System.out.println(BigDecimal.ONE);
    }



}
