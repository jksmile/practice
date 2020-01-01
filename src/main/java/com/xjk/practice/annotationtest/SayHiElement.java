package com.xjk.practice.annotationtest;

/**
 * @date: 2016/08/03
 * @author: xujinkai
 */

public class SayHiElement {


    public void SayHiDefault(String name){

        System.out.println("Hi " + name);
    }

    @SayHiAnnotation(paramValue = "Klip")
    public void sayHiAnnotation(String name){

        System.out.println("Hi " + name);
    }

    @SayHiAnnotation
    public void sayHiAnnotationDefault(String name){

        System.out.println("Hi " + name);
    }


    public void testParam(@NotNullAnnotation(msg = "Null name") String name){

        System.out.println("Test param.");
    }




//    private void privateTest(String name){
//
//        System.out.println("Just test private!" + name);
//    }
//
//    protected void protectedTest(String name){
//
//        System.out.println("Just test protected!" + name);
//    }

}
