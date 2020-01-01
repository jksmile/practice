package com.xjk.practice;

import java.util.List;

import com.xjk.practice.extendtest.Test;

/**
 * @author xujinkai
 * @date 2016/11/29
 */

public class TestAA {


    static {

        System.out.println("Init.");
    }

    public static void test(){

        System.out.println("test");


    }

    public static void testx(){

        System.out.println("testx");
    }

    public static void main(String[] args) {

        TestAA.test();

        TestAA.testx();

    }







    private String id;

    private String name;

    private int number;

    private long price;

    private List<Test> testList;

    public List<Test> getTestList() {

        return testList;
    }

    public void setTestList(List<Test> testList) {

        this.testList = testList;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public long getPrice() {

        return price;
    }

    public void setPrice(long price) {

        this.price = price;
    }

}