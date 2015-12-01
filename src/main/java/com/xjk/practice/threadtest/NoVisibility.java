package com.xjk.practice.threadtest;

/**
 * Intro:
 * Project: practice
 * Date:    11/29/15
 * Author:  xujinkai
 */


public class NoVisibility {


	private static boolean ready;

	private static int number;

	private static class ReaderThread extends Thread{

		@Override
		public void run() {

			while(!ready){

				Thread.yield();
				System.out.println("False");
			}
			System.out.println(number);

		}
	}


	public static void main(String[] args){

		new ReaderThread().start();



		number = 100;

		ready = true;


		System.out.println("Main");

	}



}
