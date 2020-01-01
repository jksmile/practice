package com.xjk.practice.annotationtest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @date: 2016/08/03
 * @author: xujinkai
 */

public class AnnotationTest {



    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        SayHiElement sayHiElement = new SayHiElement();

        Method[] methodList = SayHiElement.class.getDeclaredMethods();

        for (Method method : methodList){

            SayHiAnnotation sayHiAnnotationTmp = null;

            NotNullAnnotation notNullAnnotation = null;

            if( (sayHiAnnotationTmp = method.getAnnotation(SayHiAnnotation.class)) != null){

                method.invoke(sayHiElement,sayHiAnnotationTmp.paramValue());

            } else if(method.getParameterAnnotations() != null){

                Parameter[] a = method.getParameters();

                if( a[0] == null){

                    new Exception("xxx");
                }

            }else{

                method.invoke(sayHiElement,"XMX");
            }
        }


    }

}
