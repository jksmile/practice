package com.xjk.practice.treetest;

/**
 * Intro:
 * Project: practice
 * Date:    3/29/15
 * Author:  xujinkai
 */


public class BidirectionalTree {

	private int val;

	private BidirectionalTree pre;

	private BidirectionalTree next;

	public BidirectionalTree(int val, BidirectionalTree pre, BidirectionalTree next) {
		this.val = val;
		this.pre = pre;
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public BidirectionalTree getPre() {
		return pre;
	}

	public void setPre(BidirectionalTree pre) {
		this.pre = pre;
	}

	public BidirectionalTree getNext() {
		return next;
	}

	public void setNext(BidirectionalTree next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "BidirectionalTree{" +
				"val=" + val +
				", pre=" + pre +
				", next=" + next +
				'}';
	}
}
