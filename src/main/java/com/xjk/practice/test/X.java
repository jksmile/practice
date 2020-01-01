package com.xjk.practice.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author xujinkai
 * @date 2016/11/13
 */

public class X {



    public static void main(String[] args) {

        List<TestX> TestXList = new ArrayList<>();

        for (int i=0; i<5; i++){


            TestXList.add(new TestX("a",i));
        }


        for (int i=0; i<3; i++){


            TestXList.add(new TestX("b",i));
        }


        TestXList.add(new TestX("c",999));

        Map<String,Integer> a = new HashMap<>();

        TestXList.stream().collect(Collectors.groupingBy(TestX::getName)).forEach((key,val)->{


            a.put(key,val.stream().collect(Collectors.summingInt(TestX::getAge)));

        });

        System.out.println(a.toString());

        TestXList.stream().filter(u->u.getName().equals("a")).forEach(u -> {

            u.setSex(1000);
        });

        TestXList.stream().filter(u->u.getName().equals("c")).forEach(u->{

            u.setSex(999);
        });

        System.out.println(TestXList.toArray().toString());




    }





}

class TestX {

    private String name;

    private int age;

    private int sex;

    public TestX(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getSex() {

        return sex;
    }

    public void setSex(int sex) {

        this.sex = sex;
    }
}
