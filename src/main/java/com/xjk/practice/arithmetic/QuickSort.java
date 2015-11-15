package com.xjk.practice.arithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Intro:
 * Project: practice
 * Date:    4/6/15
 * Author:  xujinkai
 */


public class QuickSort {

	private static int arrayLength = 1000000;

	private static int[] arr = new int[arrayLength];

	public static void main(String[] args) {

		for (int i=0; i<arrayLength; i++){

			arr[i] = (int) Math.ceil(Math.random()*arrayLength);
		}

//		System.out.println(arr.length);

//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 10;
//		arr[4] = 11;
//		arr[5] = 17;


//
//		quickSortMethodA(arr,0,arrayLength-1);
//
//		List<String> a = summaryRanges(arr);
//
//		System.out.println(a.toString());

//		long startTimeA = System.currentTimeMillis();
//		quickSortMethodA(arr,0,arrayLength-1);
//		System.out.print("quickSortMethodA spend time: ");
//		System.out.println(System.currentTimeMillis()-startTimeA);

		long startTimeB = System.currentTimeMillis();
		quickSortMethodB(arr);
		System.out.print("quickSortMethodB spend time: ");
		System.out.println(System.currentTimeMillis() - startTimeB);


		System.out.println("OK");
	}


	public static void quickSortMethodA(int arr[], int start, int length){

		if(start >= length) return;

		int X = arr[start];

		int i = start;

		int j = length;

		while (i < j){

			while (i<j && arr[j] >= X)
				j--;

			if(i<j){

				arr[i++] = arr[j];

			}


			while (i<j && arr[i] < X)
				i++;

			if(i<j){

				arr[j--] = arr[i];

			}

		}

		arr[i] = X;

		quickSortMethodA(arr,start,i-1);

		quickSortMethodA(arr,i+1,length);

	}



	public static void quickSortMethodB(int arr[]){


		for (int i=0; i<arrayLength; i++){

			for (int j=i; j<arrayLength;j++){

				if(arr[i] > arr[j]){

					int temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}

	}

	public static  List<String> summaryRanges(int[] nums) {

		List<String> result = new ArrayList<String>();


		int len = nums.length;

		int step = 1;

		for(int i=0; i< len; ){

			int temp = nums[i];
			String info=nums[i]+"->";

			while(++i< len && nums[i-1] +1 == nums[i]){


			}

			if(temp==nums[i-1]){
				result.add(temp+"");
			}else {
				result.add(info + nums[i - 1]);
			}
		}

		return  result;
	}

}
