package com.xjk.practice.threadtest;

/**
 * @date: 2016/07/22
 * @author: xujinkai
 */

public class Transfer implements Runnable {

    private Bank bank;

    private int i;

    public Transfer(Bank bank, int i) {

        this.bank = bank;

        this.i = i;
    }


    public void goStatic(){

        staticclass.printx(i);
    }

    @Override
    public void run() {

        goStatic();

//        try {
//
//            transferTo(bank.getAmountArr(), i);
//
//            Thread.sleep(10);
//
//        } catch (InterruptedException e) {
//
//            e.printStackTrace();
//        }

    }

    public void transferTo(double[] amountArr, int to) {

        int money = (int) (Math.random() * 100);

        int from = (int) (Math.random() * 100);

        System.out.print(Thread.currentThread() + " ");

        amountArr[from] -= money;

        System.out.print(money + " From " + from + " to " + to + ".");

        amountArr[to] += money;

        System.out.println("TotalAmount:" + getTotalAmount());

    }


    public double getTotalAmount() {

        return bank.getTotalAmount();
    }
}
