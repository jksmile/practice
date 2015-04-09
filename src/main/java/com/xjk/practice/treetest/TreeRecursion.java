package com.xjk.practice.treetest;

/**
 * Intro:
 * Project: practice
 * Date:    3/26/15
 * Author:  xujinkai
 */


public class TreeRecursion {

	public static void printTreeFirst(TreeNode treeNodeRoot){

		if(treeNodeRoot != null){

			System.out.print(treeNodeRoot.getVal()+"->");

			printTreeFirst(treeNodeRoot.getLeftTree());

			printTreeFirst(treeNodeRoot.getRightTree());

		}

	}

	public static void printTreeMiddle(TreeNode treeNodeRoot){

		if(treeNodeRoot != null){

			printTreeMiddle(treeNodeRoot.getLeftTree());

			System.out.print(treeNodeRoot.getVal()+"->");

			printTreeMiddle(treeNodeRoot.getRightTree());

		}

	}

	public static void printTreeLast(TreeNode treeNodeRoot){

		if(treeNodeRoot != null){

			printTreeLast(treeNodeRoot.getLeftTree());

			printTreeLast(treeNodeRoot.getRightTree());

			System.out.print(treeNodeRoot.getVal()+"->");

		}

	}

	public static void main(String[] args){

		TreeNode treeNodeRoot = new TreeNode(1);

		TreeNode treeNodeLeft1  = new TreeNode(2);
		treeNodeRoot.setLeftTree(treeNodeLeft1);
		TreeNode treeNodeRight1 = new TreeNode(3);
		treeNodeRoot.setRightTree(treeNodeRight1);

		TreeNode treeNodeLeft11 = new TreeNode(4);
		treeNodeLeft1.setLeftTree(treeNodeLeft11);
		TreeNode treeNodeRight12 = new TreeNode(5);
		treeNodeLeft1.setRightTree(treeNodeRight12);


		TreeNode treeNodeRightX = new TreeNode(100);
		treeNodeLeft11.setRightTree(treeNodeRightX);

		TreeNode treeNodeLeftY = new TreeNode(98);
		treeNodeRightX.setLeftTree(treeNodeLeftY);
		TreeNode treeNodeRightZ = new TreeNode(99);
		treeNodeRightX.setRightTree(treeNodeRightZ);


		//printTreeFirst(treeNodeRoot);
		//printTreeMiddle(treeNodeRoot);
		printTreeLast(treeNodeRoot);

	}





}