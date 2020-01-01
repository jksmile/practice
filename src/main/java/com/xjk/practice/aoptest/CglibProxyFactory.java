package com.xjk.practice.aoptest;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @date: 2016/08/12
 * @author: xujinkai
 */

public class CglibProxyFactory implements MethodInterceptor {


    private Object o;


    public Object bind(Object o){

        this.o = o;

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(o.getClass());

        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("CGLIB Proxy.");

        Object result = methodProxy.invoke(this.o, objects);

        return  result;
    }
}
