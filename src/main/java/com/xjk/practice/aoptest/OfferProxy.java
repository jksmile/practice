package com.xjk.practice.aoptest;

import com.sun.javafx.perf.PerformanceTracker;

/**
 * @date: 2016/08/12
 * @author: xujinkai
 */

public class OfferProxy implements OfferInterface {


    private OfferInterface offer;


    public OfferProxy(OfferInterface offer) {

        this.offer = offer;
    }

    @Override
    public void postOffer() {

        System.out.println("ok");


        offer.postOffer();

        PerformanceTracker.outputLog();
    }
}
