package com.xjk.practice.aoptest.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.ClassUtils;

/**
 * @date: 2016/09/16
 * @author: xujinkai
 */

public class TestInterceptor implements MethodInterceptor ,InitializingBean {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable
    {
        System.out.println("zhangsan start.....");
        Object retVal = invocation.proceed();
        System.out.println("end");
        return retVal;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        ProxyFactory pf = new ProxyFactory();

        pf.addInterface(BaseService.class);


        pf.addAdvice(this);

        ClassLoader classLoader = ClassUtils.getDefaultClassLoader();

        BaseService x = (BaseService) pf.getProxy(classLoader);

        System.out.println(x.toString());



    }

    public static void main(String[] args) throws Exception {

        TestInterceptor testInterceptor = new TestInterceptor();

        testInterceptor.afterPropertiesSet();


    }


}