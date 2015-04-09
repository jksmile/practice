package com.xjk.practice.systemtest;

import java.util.ResourceBundle;

/**
 * Intro:
 * Project: practice
 * Date:    3/11/15
 * Author:  xujinkai
 */


public class PathTest {

	private static ResourceBundle rb = null;

	static {
		try {
			rb = ResourceBundle.getBundle("system");
		} catch (Exception mre) {
			mre.printStackTrace();
			System.out.println("Error!");
		}
	}

	public static void main(String[] args) {

			if(rb != null){
				System.out.println("Not NULL!");
			}

		System.out.println(rb.toString());
	}
}
