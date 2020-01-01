package com.xjk.practice.aoptest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @date: 2016/08/12
 * @author: xujinkai
 */

public class JDKProxyFactory implements InvocationHandler{


    private Object o;


    public Object bind(Object o){

        this.o = o;

        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        System.out.println("Begin.");

        try {
            result  = method.invoke(o, args);
        }catch (Exception ignored){

        }

        return  result;
    }
}
