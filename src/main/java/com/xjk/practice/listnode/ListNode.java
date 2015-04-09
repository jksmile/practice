package com.xjk.practice.listnode;

/**
 * Intro:
 * Project: practice
 * Date:    3/25/15
 * Author:  xujinkai
 */


public class ListNode{

	private int val;

	private ListNode next;

	public ListNode(int val){
		this.val = val;
	}


	public void setVal(int val){
		this.val = val;
	}

	public int getVal(){
		return val;
	}

	public void setNext(ListNode next){
		this.next = next;
	}

	public ListNode getNext(){
		return next;
	}

}