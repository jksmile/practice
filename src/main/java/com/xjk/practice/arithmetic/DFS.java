package com.xjk.practice.arithmetic;

import java.util.Stack;

/**
 * Intro:
 * Project: practice
 * Date:    3/31/15
 * Author:  xujinkai
 */


public class DFS {

	private static final int n = 5;

	private static int count = 0;

	private static char[] str = new char[n*2];



	public static void bracketProblem(int n, int leftUsedNum, int rightUsedNum){

		if(leftUsedNum + rightUsedNum == 2*n && leftUsedNum == rightUsedNum ){

			System.out.println(new String(str));
			count++;
			return;
		}

		if(leftUsedNum < rightUsedNum || leftUsedNum + rightUsedNum >= 2*n){

			return;

		}

		int index = leftUsedNum + rightUsedNum;

		str[index] = '(';

		bracketProblem(n,leftUsedNum+1,rightUsedNum);

		str[index] = ')';

		bracketProblem(n,leftUsedNum,rightUsedNum+1);

	}


	public static void main(String[] args) {
//
//		bracketProblem(n,0,0);
//		System.out.println(count);

		Stack<Character> stack = new Stack<Character>();

	}

	public static void bracketProblemB(int n){

		Stack<Character> stack = new Stack<Character>();



		while (stack.capacity() < 6){

		}



	}

}
