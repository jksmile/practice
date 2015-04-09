package com.xjk.practice.extendtest;

/**
 * Intro:
 * Project: practice
 * Date:    3/18/15
 * Author:  xujinkai
 */


public class C extends B {


	@Override
	protected void printC() {
		System.out.println("printC");
	}

	public static void main(String[] args) {
		A a = null;
		a = new C();


		a.printA();


	}

}
