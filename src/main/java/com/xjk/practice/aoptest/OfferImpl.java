package com.xjk.practice.aoptest;

/**
 * @date: 2016/08/12
 * @author: xujinkai
 */

public class OfferImpl implements OfferInterface{

    @Override
    public void postOffer() {

        System.out.println("Post Offer!");
    }
}
