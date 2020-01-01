package com.xjk.practice.enumtest;

/**
 * @author xujinkai
 * @date 2016/11/11
 */

public enum  StudentEnum {


    PUPIL(1,"小学生"),
    JUNIOR(2,"初中生");

    private int code;

    private String desc;

    StudentEnum(int code, String desc) {

        this.code = code;
        this.desc = desc;
    }

    public void printName(){

        System.out.println(this.name());
    }

    public static void main(String[] args) {

        StudentEnum.PUPIL.printName();
    }
}
