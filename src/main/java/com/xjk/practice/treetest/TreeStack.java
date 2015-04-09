package com.xjk.practice.treetest;

import apple.laf.JRSUIUtils;

import java.util.Stack;

/**
 * Intro:
 * Project: practice
 * Date:    3/27/15
 * Author:  xujinkai
 */


public class TreeStack {


	//Sort by middle method.
	public static void printTreeWithStack_middle(TreeNode treeNodeRoot){

		Stack<TreeNode> stack = new Stack<TreeNode>();

		stack.push(treeNodeRoot);

		while (!stack.empty()){

			while (stack.peek() != null){

				stack.push(stack.peek().getLeftTree());

			}

			//Remove the null element.
			stack.pop();

			if(!stack.empty()){

				TreeNode node = stack.pop();

				System.out.print(node.getVal() + "->");

				stack.push(node.getRightTree());

			}

		}

	}

	public static void printTreeWithStack_First(TreeNode treeNodeRoot) {

		Stack<TreeNode> stack = new Stack<TreeNode>();

		stack.push(treeNodeRoot);

		while (!stack.empty()) {
			while (stack.peek() != null) {

				System.out.print(stack.peek().getVal() + "->");

				stack.push(stack.peek().getLeftTree());

			}

			//Remove null element from stack.
			stack.pop();

			if (!stack.empty()) {

				TreeNode p = stack.pop();

				stack.push(p.getRightTree());

			}
		}

	}


	public static void printTreeWithStack_Last(TreeNode treeNodeRoot){

		Stack<TreeNode> stack = new Stack<TreeNode>();

		stack.push(treeNodeRoot);

		while (!stack.empty()){

			while (stack.peek() != null){

				stack.push(stack.peek().getLeftTree());

			}

			stack.pop();

			if (!stack.empty()){

				TreeNode currentTree = stack.pop();

				if(currentTree.getRightTree() == null) {

					System.out.print(currentTree.getVal()+"->");

					if(!stack.empty()) {
						stack.peek().setLeftTree(null);
					}
				}else{

					TreeNode RT = currentTree.getRightTree();

					currentTree.setRightTree(null);

					stack.push(currentTree);

					stack.push(RT);
				}
			}

		}


	}

	protected static void iterativePostorder(TreeNode p) {

		TreeNode q = p;
		Stack<TreeNode> stack = new Stack<TreeNode>();

		while (p != null) {
			// 左子树入栈
			for (; p.getLeftTree() != null; p = p.getLeftTree())
				stack.push(p);
			// 当前节点无右子或右子已经输出
			while (p != null && (p.getRightTree() == null || p.getRightTree() == q)) {
				System.out.print(p.getVal()+"->");
				q = p;// 记录上一个已输出节点
				if (stack.empty())
					return;
				p = stack.pop();
			}
			// 处理右子
			stack.push(p);
			p = p.getRightTree();
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

		TreeNode treeNodeLeft13 = new TreeNode(6);
		treeNodeRight1.setLeftTree(treeNodeLeft13);
		TreeNode treeNodeRight14 = new TreeNode(7);
		treeNodeRight1.setRightTree(treeNodeRight14);


//		printTreeWithStack_middle(treeNodeRoot);
//
//		System.out.println();
//		printTreeWithStack_First(treeNodeRoot);

//		System.out.println();
		printTreeWithStack_Last(treeNodeRoot);

		//iterativePostorder(treeNodeRoot);
		//printTreeFirst(treeNodeRoot);
		//printTreeMiddle(treeNodeRoot);
		//printTreeLast(treeNodeRoot);

	}


	public static void testStack(){

		Stack<String> testStack = new Stack<String>();

		testStack.push("a");
		testStack.push("b");

		System.out.println(testStack.peek());

		System.out.println(testStack.size());

	}



}
