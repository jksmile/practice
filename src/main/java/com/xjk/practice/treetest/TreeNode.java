package com.xjk.practice.treetest;

/**
 * Intro:
 * Project: practice
 * Date:    3/27/15
 * Author:  xujinkai
 */


public class TreeNode{


private TreeNode leftTree;

private int val;

private TreeNode rightTree;

public TreeNode(int val){

		this.val = val;
		}

public TreeNode getLeftTree() {
		return leftTree;
		}

public void setLeftTree(TreeNode leftTree) {
		this.leftTree = leftTree;
		}

public int getVal() {
		return val;
		}

public void setVal(int val) {
		this.val = val;
		}

public TreeNode getRightTree() {
		return rightTree;
		}

public void setRightTree(TreeNode rightTree) {
		this.rightTree = rightTree;
		}

@Override
public String toString() {
		return "TreeNode{" +
		"leftTree=" + leftTree +
		", val=" + val +
		", rightTree=" + rightTree +
		'}';
		}

		}
