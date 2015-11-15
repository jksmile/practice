package com.xjk.practice.treetest;

import apple.laf.JRSUIUtils;

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

	public static void invertTree(TreeNode treeNode){

		if(treeNode != null){

			TreeNode tempLeftTree = treeNode.getLeftTree();

			treeNode.setLeftTree(treeNode.getRightTree());

			treeNode.setRightTree(tempLeftTree);

			invertTree(treeNode.getLeftTree());

			invertTree(treeNode.getRightTree());
		}

	}

	public static void main(String[] args){

		TreeNode treeNodeRoot = new TreeNode(1);

		//
		//           1
		//          / \
		//         2   3
		//
		TreeNode treeNodeLeft1 = new TreeNode(2);
		treeNodeRoot.setLeftTree(treeNodeLeft1);
		TreeNode treeNodeRight1 = new TreeNode(3);
		treeNodeRoot.setRightTree(treeNodeRight1);


		//
		//           1
		//          / \
		//         2   3
		//        / \
		//       4   5
		TreeNode treeNodeLeft11 = new TreeNode(4);
		treeNodeLeft1.setLeftTree(treeNodeLeft11);
		TreeNode treeNodeLeft12 = new TreeNode(5);
		treeNodeLeft1.setRightTree(treeNodeLeft12);

		//
		//           1
		//          / \
		//         2   3
		//        /\   /\
		//       4  5 6  7
		TreeNode treeNodeRight11 = new TreeNode(6);
		treeNodeRight1.setLeftTree(treeNodeRight11);
		TreeNode treeNodeRight12 = new TreeNode(7);
		treeNodeRight1.setRightTree(treeNodeRight12);



		printTreeFirst(treeNodeRoot);
		System.out.println();
		printTreeMiddle(treeNodeRoot);
		System.out.println();
		printTreeLast(treeNodeRoot);

	}





}