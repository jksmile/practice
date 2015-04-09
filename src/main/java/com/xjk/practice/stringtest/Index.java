package com.xjk.practice.stringtest;

/**
 * Intro:
 * Project: practice
 * Date:    3/23/15
 * Author:  xujinkai
 */


public class Index {


	public static void main(String[] args) {

		String[]  str = new String[2];

		char[]  charArr = new char[2];


		str[0] = "a";

		str[1] = "b";

		System.out.println(str.toString());
		charArr[0] = 'C';

		charArr[1] = 'd';

		System.out.println(new String(charArr));
	}

}
