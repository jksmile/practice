package com.xjk.practice.datetest;

import java.util.Date;

/**
 * Intro:
 * Project: practice
 * Date:    2/13/15
 * Author:  xujinkai
 */


public class Index {

	private static int number = 0;

	public static void main(String[] args) {

		splitLine();

		compareToTest();

		splitLine();

		getTimeTest();

		splitLine();

		dateYMD();

		splitLine();

		afterTest();

	}


	private static void compareToTest() {

		Date date1 = new Date();

		Date date2 = new Date();

		long sec = 1423841157000L;

		Date date3 = new Date(sec);

		System.out.println("date1 compare date2 ======>" + date1.compareTo(date2));

		System.out.println("date1 compare date3 ======>" + date1.compareTo(date3));

		System.out.println("date3 compare date1 ======>" + date3.compareTo(date1));

	}

	private static void getTimeTest() {

		Date dateGetTime = new Date();

		System.out.println("Test getTime function ======>" + dateGetTime.getTime());
	}


	private static void dateYMD() {

		Date dateYMD = new Date(2013, 12, 12);

		System.out.println("new Date(2013, 12, 12).getTime [From 1900] ======>" + dateYMD.getTime());
	}


	private static void afterTest() {

//		Date dateNow = new Date();
//
//		Date
//
//		System.out.println("dateNow after datePast ======>"+dateNow.after(datePast));
//
//		System.out.println("datePast after dateNow ======>"+datePast.after(dateNow));

	}

	private static void splitLine() {

		System.out.println();

		number++;

		System.out.println(number + ".----------------------------------------------------");

	}

}
