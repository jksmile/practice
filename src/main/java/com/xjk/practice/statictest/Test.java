package com.xjk.practice.statictest;

/**
 * Created by yongche on 15/8/17.
 */
public class Test {

    private static int num;


    public static void main(String[] args) {

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
