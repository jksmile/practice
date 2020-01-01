package com.xjk.practice.test;

import org.springframework.beans.BeanUtils;

/**
 * @author xujinkai
 * @date 2016/11/26
 */

public class BeanCopyTest {

    public static void main(String[] args) {

        AX ax = new AX("1000",30);

        BX bx = new BX(0,0);

        BeanUtils.copyProperties(ax,bx);

        System.out.println(bx);
    }
}

class AX {

    private String money;

    private int age;

    public AX(String money, int age) {

        this.money = money;
        this.age = age;
    }

    public String getMoney() {

        return money;
    }

    public void setMoney(String money) {

        this.money = money;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}

class BX{

    private long money;

    private int age;

    public BX(long money, int age) {

        this.money = money;
        this.age = age;
    }

    public long getMoney() {

        return money;
    }

    public void setMoney(long money) {

        this.money = money;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
