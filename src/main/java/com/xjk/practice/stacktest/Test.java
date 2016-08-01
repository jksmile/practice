package com.xjk.practice.stacktest;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Collections;
import java.util.Stack;

/**
 * @date: 2016/04/19
 * @author: xujinkai
 */

public class Test {

    public static void main(String[] args) {

        Long a = null;

        String x = String.format("num: %d. score:%d",1,3);

        System.out.println(x);
    }



    public static void testRemainder(){

        BigDecimal n1 = new BigDecimal("10.1");

        BigDecimal n2 = new BigDecimal("20.4");

        BigDecimal result = null;
        int signOf2 = n2.signum();
        try {
            double dn1 = n1.doubleValue();
            n2 = n2.multiply(new BigDecimal(signOf2));
            BigDecimal remainderOf2 = n2.remainder(BigDecimal.ONE);
            BigDecimal n2IntPart = n2.subtract(remainderOf2);
            int t = n2IntPart.intValueExact();
            BigDecimal intPow = n1.pow(t, MathContext.DECIMAL64);
            BigDecimal doublePow = new BigDecimal(Math.pow(dn1, remainderOf2.doubleValue()));
            result = intPow.multiply(doublePow);
        } catch (Exception e) {

        }


    }

    public static void reverseStack(){

        Stack<String> stackStr = new Stack<String>();

        stackStr.push("JK");

        stackStr.push("Klip");

        stackStr.push("Xu");

        System.out.println(stackStr.toString());

        Collections.reverse(stackStr);

        System.out.printf(stackStr.toString());

    }

    enum  FormulaFactorName{

        LOAN("loan"),

        MONTH_RATIO("monthRatio"),

        MONTHS("months"),

        REPAY_NO("repayNo");


        public final String factorName;

        FormulaFactorName(String name){

            this.factorName = name;
        }

    }

    public static void testx(){

        System.out.println(FormulaFactorName.LOAN.factorName);
    }
}
