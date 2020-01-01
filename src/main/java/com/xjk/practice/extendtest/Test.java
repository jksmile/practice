package com.xjk.practice.extendtest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.google.gson.Gson;

/**
 * @author xujinkai
 * @date 2016/11/26
 */

public class Test {

    public static void main(String[] args) {


        Test test = new Test();

        Method[] methodList = test.getClass().getMethods();

        System.out.println("ok");

        for (Method method : methodList){

            if(method.getName().equals("test3")){

                Class<?>[] pt = method.getParameterTypes();

                System.out.println("ok");



            }


        }


        test2();
    }




    public static void test2(){

        List<TESTXXX> testxxxList = new ArrayList<>();

        testxxxList.add(new TESTXXX("a",1));

        String a = new Gson().toJson(testxxxList);

        List<Object> x = new Gson().fromJson(a, List.class);

        for(Object obj : x){

            Class y  = obj.getClass();

            TESTXXX z = new TESTXXX(null,0);

            BeanUtils.copyProperties(obj,z);




            System.out.println("Ok");
        }


    }


    public static void test3(List<TESTXXX> testxxxList, String a){




    }




}

class TESTXXX{

    private String name;

    private int age;

    public TESTXXX(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}

