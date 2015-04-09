package com.xjk.practice.stringtest;

/**
 * Intro:
 * Project: practice
 * Date:    3/29/15
 * Author:  xujinkai
 */


public class StringReverse {

	private static final String str = "I am a super man";

	public static String reverseOne(String str){

		if(null == str) return str;

		char[] strArr = str.toCharArray();

		StringBuffer strResult = new StringBuffer();

		for(int i=strArr.length-1; i>=0; i--){
			strResult.append(strArr[i]);
		}

		return strResult.toString();
	}

	public static String reverseTwo(String str){

		if(null == str) return str;

		int strLength = str.length();

		StringBuffer strResult = new StringBuffer();

		for(int i=strLength; i>0; i--){

				strResult.append(str.substring(i-1,i));

		}

		return strResult.toString();
	}


	public static String reverseThree(String str){

		StringBuffer strResult = new StringBuffer(str).reverse();

		return  strResult.toString();
	}

	public static String reverseFour(String str){

		if(null == str) return str;

		if(str.length()==1) return str;

		int strLength = str.length();

		String leftStr = str.substring(0,strLength/2);

		String rightStr= str.substring(strLength/2,strLength);

		return reverseFour(rightStr)+reverseFour(leftStr);
	}



	public static void main(String[] args) {
		//reverseTwo(str);

		System.out.println("abc".substring(0,1));

		System.out.println(5/2);

		System.out.println(reverseFour("a"));

		char[] strArr = {'a','b'};

		System.out.println(strArr.toString());
	}

}
