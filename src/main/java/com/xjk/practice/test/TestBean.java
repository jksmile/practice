package com.xjk.practice.test;

import net.sf.json.JSONObject;

/**
 * @date: 2016/06/17
 * @author: xujinkai
 */

public class TestBean {

    public static void main(String[] args) {

        System.out.println(0%2);

        System.out.println(1%2);

        System.out.println(2%2);

        TestBean testBean = new TestBean("a",1,1);

        System.out.println(JSONObject.fromObject(testBean).toString());

    }

    private String name;

    private int age;

    private int tag;

    public TestBean(String name, int age, int tag) {

        this.name = name;
        this.age = age;
        this.tag = tag;
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

    public int getTag() {

        return tag;
    }

    public void setTag(int tag) {

        this.tag = tag;
    }
}
