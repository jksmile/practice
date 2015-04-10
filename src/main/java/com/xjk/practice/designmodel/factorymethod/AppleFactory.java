package com.xjk.practice.designmodel.factorymethod;

/**
 * Intro:
 * Project: practice
 * Date:    4/9/15
 * Author:  xujinkai
 */


public class AppleFactory implements Factory {

	@Override
	public Product productInfo() {

		return new AppleProduct();

	}
}
