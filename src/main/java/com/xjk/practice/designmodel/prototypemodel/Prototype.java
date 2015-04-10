package com.xjk.practice.designmodel.prototypemodel;

import com.xjk.practice.designmodel.factorymethod.Product;

/**
 * Intro:
 * Project: practice
 * Date:    4/10/15
 * Author:  xujinkai
 */


public class Prototype implements Cloneable {


	private int a;

	private String b;

	private String[] c = new String[1];


	public Prototype clone(){

		Prototype prototype = null;

		try{

			prototype = (Prototype) super.clone();

		}catch (CloneNotSupportedException e){

			System.out.println("Exception!");
		}

		return prototype;

	}


	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String[] getC() {
		return c;
	}

	public void setC(String[] c) {
		this.c = c;
	}
}
