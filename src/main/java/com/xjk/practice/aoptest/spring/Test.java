package com.xjk.practice.aoptest.spring;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @date: 2016/09/16
 * @author: xujinkai
 */
public class Test
{
    public static void main(String[] args)
    {

        test2();
    }


    public static void test1(){
        //具体的业务逻辑
        LoginService loginservice = new LoginService();

        //代理工厂
        ProxyFactory pf = new ProxyFactory(loginservice);

        //添加advice
        pf.addAdvice(new TestInterceptor());



        //产生代理对象
        LoginService lg = (LoginService) pf.getProxy();

        lg.login();
    }

    public static void test2(){

        ProxyFactory pf = new ProxyFactory();

        BaseService loginservice = new LoginService();


        pf.addInterface(BaseService.class);

        pf.addAdvice(new TestInterceptor());

        BaseService log = (BaseService) pf.getProxy();



    }

}