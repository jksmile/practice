package com.xjk.practice.test;

/**
 * @date: 2016/07/20
 * @author: xujinkai
 */

public class SingtonTest {


    private Long x;

//    private static final SingtonTest singtonTest = new SingtonTest();
//
//    private SingtonTest(){
//
//
//    }
//
//
//    public static SingtonTest getInstance(){
//
//        return  singtonTest;
//    }

    public void getX(int a) {

        if(a>0){

            System.out.println(x);
        }else{

            try {

                Thread.sleep(2000);

                System.out.println("sleep:"+x);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public void setX(Long x) {

        this.x = x;
    }



}
