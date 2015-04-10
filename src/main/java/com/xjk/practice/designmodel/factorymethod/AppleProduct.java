package com.xjk.practice.designmodel.factorymethod;

/**
 * Intro:
 * Project: practice
 * Date:    4/9/15
 * Author:  xujinkai
 */


public class AppleProduct implements Product {

	@Override
	public void productName() {

		System.out.println("I'm an iphone6S !");

	}

	@Override
	public void productPrice() {

		System.out.println("Current phone price: 6999 RMB.");

	}
}
