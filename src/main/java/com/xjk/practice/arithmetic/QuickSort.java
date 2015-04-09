package com.xjk.practice.arithmetic;

import com.xjk.practice.treetest.MaxValPath;

/**
 * Intro:
 * Project: practice
 * Date:    4/6/15
 * Author:  xujinkai
 */


public class QuickSort {

	private static int arrayLength = 100000;

	private static int[] arr = new int[arrayLength];

	public static void main(String[] args) {

		for (int i=0; i<arrayLength; i++){

			arr[i] = (int) Math.ceil(Math.random()*arrayLength);
		}

		long startTimeA = System.currentTimeMillis();
		quickSortMethodA(arr,0,arrayLength-1);
		System.out.print("quickSortMethodA spend time: ");
		System.out.println(System.currentTimeMillis()-startTimeA);

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



}
