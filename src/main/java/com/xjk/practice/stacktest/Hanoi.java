package com.xjk.practice.stacktest;

import java.util.Stack;

/**
 * Intro:
 * Project: practice
 * Date:    3/26/15
 * Author:  xujinkai
 */


public class Hanoi {

	private static int count = 1;


	public static void move(int n,String x,String y,String z){


		if(n==1){

			//z.push(x.pop());
			System.out.println("Move "+n+" from "+x+" to "+z+"!---"+count++);
		}else{

			move(n-1,x,z,y);
			System.out.println("Move "+n+"from "+x+" to "+z+"!---"+count++);
			move(n-1,y,x,z);

		}

	}


	public static void main(String[] args) {
		//move(3,new Stack<Character>(),new Stack<Character>(),new Stack<Character>());
		move(10,"X","Y","Z");
	}




}
