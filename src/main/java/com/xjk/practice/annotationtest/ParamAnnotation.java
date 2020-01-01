package com.xjk.practice.annotationtest;

import javax.validation.constraints.NotNull;

/**
 * @date: 2016/08/03
 * @author: xujinkai
 */

public class ParamAnnotation {


    public static void main(String[] args) {

        ParamAnnotation p = new ParamAnnotation();

        String a = null;

        p.testParam(a);

    }


    public void testParam(@NotNull(message = "Null param.") String name){

        System.out.println(name);

    }
}
