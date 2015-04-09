package com.xjk.practice.treetest;

/**
 * Intro:
 * Project: practice
 * Date:    3/29/15
 * Author:  xujinkai
 */


public class SingleTrackTree {

	private int val;

	private SingleTrackTree next;

	public SingleTrackTree(int val, SingleTrackTree next) {
		this.val = val;
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public SingleTrackTree getNext() {
		return next;
	}

	public void setNext(SingleTrackTree next) {
		this.next = next;
	}


	@Override
	public String toString() {
		return "SingleTrackTree{" +
				"val=" + val +
				", next=" + next +
				'}';
	}
}
