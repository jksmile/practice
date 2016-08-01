package com.xjk.practice.statictest;

import java.math.BigDecimal;

/**
 * Created by yongche on 15/8/17.
 */
public class Test extends Thread{

    private static int num;


    public static void main(String[] args) {

        BigDecimal test = new BigDecimal("7283");

        BigDecimal x = test.max(new BigDecimal("88888"));

        if( test.max(new BigDecimal("88888")).equals(new BigDecimal("88888")) ){
            System.out.println("XX");
        }

        System.out.println(test.longValue());

        for(int i=1; i<5; i++){

            test = test.add(new BigDecimal(i));
        }

        System.out.println(test.toString());

//
//        new Test().start();
//
//        testStaticMethod(false, 20);

    }

    @Override
    public void run() {
        //System.out.println("XXX");
        testStaticMethod(true,100);
    }



    public static void testStaticMethod(boolean isWait, int num){

        num++;

        if(isWait){

            try {
                Thread.sleep(10000l);
                System.out.println("Wait...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(num);


    }

    public static void testStaticField(){

        Test test1 = new Test();

        Test test2 = new Test();


        test1.setNum(10);

        test2.setNum(100);

        System.out.println(test1.getNum());

        System.out.println(test2.getNum());

    }

    public int getNum() {
        return Test.num;
    }

    public void setNum(int num) {
        Test.num = num;
    }


}


interface a{


    BigDecimal M_BIG = new BigDecimal(100);
}