package com.xjk.practice.designmodel.singleton;

/**
 * Intro:
 * Project: practice
 * Date:    4/9/15
 * Author:  xujinkai
 */


public class Query {


	public static void main(String[] args) {


		SingletonModel a = SingletonModel.getInstance();

		SingletonModel b = SingletonModel.getInstance();

		if(a == b){

			System.out.println("a and b is a same object!");
		}

	}
}
