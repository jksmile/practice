package com.xjk.practice.aoptest;

/**
 * @date: 2016/08/12
 * @author: xujinkai
 */

public class Test {

    public static void main(String[] args) {

        cglibProxy();
    }

    public static void proxyModel(){

        OfferInterface offerProxy = new OfferProxy(new OfferImpl());

        offerProxy.postOffer();
    }

    public static void jdkProxy(){

        OfferInterface o = (OfferInterface) (new JDKProxyFactory().bind(new OfferImpl()));

        o.postOffer();
    }

    public static void cglibProxy(){

            DefaultOffer defaultOffer = (DefaultOffer) (new CglibProxyFactory().bind(new DefaultOffer()));

            defaultOffer.postOffer();

    }

}
