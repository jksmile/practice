package com.xjk.practice.designmodel.factorymethod;

/**
 * Intro:
 * Project: practice
 * Date:    4/9/15
 * Author:  xujinkai
 */


public class Query {


	public static void main(String[] args) {

		Factory xFactory = new AppleFactory();

		Product pro = xFactory.productInfo();

		pro.productName();

		pro.productPrice();
	}
}
