package com.xjk.practice.extendtest;

/**
 * @author xujinkai
 * @date 2016/11/26
 */

public class NotEmptyClass extends EmptyClass{

    private String name;

    private int age;

    public NotEmptyClass(String name, int age) {

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

    @Override
    public String toString() {

        return "NotEmptyClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
