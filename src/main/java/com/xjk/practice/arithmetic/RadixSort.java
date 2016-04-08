package com.xjk.practice.arithmetic;

import java.util.Vector;

/**
 * Intro:
 * Project: practice
 * Date:    2/21/16
 * Author:  xujinkai
 */


public class RadixSort {

	private static int maxNumLen;


	public static void main(String[] args) {

		int[] arr={12,8,132,29,76,48,7};

		maxNumLen = findMaxNumLen(arr);

		for(int i=1; i<=maxNumLen; i++){

			radixSort(arr,i);
		}
	}


	public static int findMaxNumLen(int[] arr){

		int tmp = arr[0];

		for(int i=1; i<arr.length; i++){

			if(arr[i] > tmp) tmp = arr[i];
		}

		return Integer.toString(tmp).length();
	}


	public static void radixSort(int[] arr, int digit){

		Vector<Vector<Integer>> contain = new Vector<Vector<Integer>>();

		for(int i=0; i<10; i++){

			Vector<Integer> vettor = new Vector<Integer>();

			contain.add(vettor);
		}

		for(int num:arr){

			int tmp = findDigit(num,digit);

			contain.get(tmp).add(num);
		}

		int p=0;

		for(Vector<Integer> numLink:contain){

			if(numLink.size()>0){

				for(Integer num:numLink){

					arr[p++] = num;
				}
			}
		}

		contain=null;

	}


	public static int findDigit(int num, int digit){

		String numStr = Integer.toString(num);

		if(numStr.length()<digit) return 0;

		return Character.getNumericValue(Character.codePointAt(numStr,numStr.length()-digit));
	}

}
