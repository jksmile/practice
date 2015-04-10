package com.xjk.practice.designmodel.singleton;

/**
 * Intro: The singleton model is belong creation model.
 *
 * Project: practice
 *
 * Date:    4/9/15
 *
 * Author:  xujinkai
 */


public class SingletonModel {

	private SingletonModel(){

	}

	private static SingletonModel instance = null;


	public static SingletonModel getInstance(){

		if( instance == null ){

			new SingletonModel();

		}

		return instance;
	}


	
}
