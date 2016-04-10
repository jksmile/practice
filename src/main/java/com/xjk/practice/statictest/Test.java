package com.xjk.practice.statictest;

/**
 * Created by yongche on 15/8/17.
 */
public class Test extends Thread{

    private static int num;


    public static void main(String[] args) {


        new Test().start();

        testStaticMethod(false, 20);

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
