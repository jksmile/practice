package com.xjk.practice.designmodel.compositemodel;

/**
 * Intro:
 * Project: practice
 * Date:    4/12/15
 * Author:  xujinkai
 */


public class ActionMovie extends Movie {


	@Override
	protected void play() {

		System.out.println("Show action movie...");
	}

}
