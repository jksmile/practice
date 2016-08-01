package com.xjk.practice.threadtest;

/**
 * @date: 2016/07/22
 *
 * @author: xujinkai
 */
public class Bank {

    private static final int AMOUNT_SIZE = 100;


    private double initAmount;


    private double[] amountArr = new double[AMOUNT_SIZE];

    public Bank(double initAmount) {

        this.initAmount = initAmount;


        for(int i=0; i<AMOUNT_SIZE; i++){

            amountArr[i] = initAmount;
        }

    }


    public double getTotalAmount(){

        double sum = 0;

        for (double amount : amountArr){

            sum += amount;

        }

        return sum;
    }

    public static int getAmountSize() {

        return AMOUNT_SIZE;
    }

    public double getInitAmount() {

        return initAmount;
    }

    public double[] getAmountArr() {

        return amountArr;
    }
}
