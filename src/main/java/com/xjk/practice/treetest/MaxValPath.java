package com.xjk.practice.treetest;

import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeMap;

/**
 * Intro:
 * Project: practice
 * Date:    4/5/15
 * Author:  xujinkai
 */


public class MaxValPath {

	public static void main(String[] args) {

		testCase();

	}

	public static void testCase(){

		TreeNode treeNodeRoot = new TreeNode(1);

		TreeNode treeNodeLeft1  = new TreeNode(2);
		treeNodeRoot.setLeftTree(treeNodeLeft1);
		TreeNode treeNodeRight1 = new TreeNode(3);
		treeNodeRoot.setRightTree(treeNodeRight1);

		TreeNode treeNodeLeft11 = new TreeNode(4);
		treeNodeLeft1.setLeftTree(treeNodeLeft11);
		TreeNode treeNodeRight12 = new TreeNode(5);
		treeNodeLeft1.setRightTree(treeNodeRight12);

		TreeNode treeNodeLeft121 = new TreeNode(6);
		treeNodeRight12.setLeftTree(treeNodeLeft121);
		TreeNode treeNodeRight122 = new TreeNode(7);
		treeNodeRight12.setRightTree(treeNodeRight122);


		findMaxValueOfPath(treeNodeRoot);

		System.out.println(treeMap.lastEntry());
	}


	private static Stack<TreeNode> stack = new Stack<TreeNode>();


	private static TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>();


	public static void findMaxValueOfPath(TreeNode tree){

		if(null == tree) return;

		stack.push(tree);

		if(tree.getLeftTree() == null && tree.getRightTree() == null){

			String s = "";

			int sum = 0;

			for(TreeNode tmp: stack){

				s += tmp.getVal() + "->";

				sum += tmp.getVal();

			}

			treeMap.put(sum,s);

			stack.pop();

		}else{

			findMaxValueOfPath(tree.getLeftTree());

			findMaxValueOfPath(tree.getRightTree());

			stack.pop();

		}

	}





	private static String s = "";

	private static int sum = 0;

	public static void findMaxValueOfPathX(TreeNode tree){

		if(null == tree) return;

		stack.push(tree);

		s += tree.getVal()+"->";

		sum += tree.getVal();

		if(tree.getLeftTree() == null && tree.getRightTree() == null){

			treeMap.put(sum,s);

			stack.pop();

			s = "";

			sum = sum - tree.getVal();

		}else{

			findMaxValueOfPathX(tree.getLeftTree());

			findMaxValueOfPathX(tree.getRightTree());

		}

	}






	static ArrayList<Integer> listVal= new ArrayList<Integer>();

	static ArrayList<Stack> stackArr = new ArrayList<Stack>();

	static Stack<Integer> tmpStack = new Stack<Integer>();

	public static void readTree(TreeNode treeNodeRoot){

		if(treeNodeRoot != null){

			tmpStack.push(treeNodeRoot.getVal());

			if(listVal.contains(treeNodeRoot.getVal())){

				Stack<Stack> St = new Stack<Stack>();

				St.push(tmpStack);

				stackArr.add(St);

			}

			readTree(treeNodeRoot.getLeftTree());

			readTree(treeNodeRoot.getRightTree());

		}

		tmpStack.pop();

	}



}
