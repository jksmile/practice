package com.xjk.practice.invoketest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xujinkai
 * @date 2016/11/06
 */

public class Test {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {



        int a = 0;

        Integer b = a;



        TestBean testBean = new TestBean();


        Method[] methods = testBean.getClass().getMethods();

        for (Method method : methods){

            switch (method.getName()){

                case "setTitle":

                    method.invoke(testBean,"AAA");

                    break;

                case "setDescx":
                case "setDesc":

                    method.invoke(testBean,"xxx");

                    break;

            }

        }

        System.out.println("Ok");


    }

}
