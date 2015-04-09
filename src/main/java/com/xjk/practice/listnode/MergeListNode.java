package com.xjk.practice.listnode;

import java.util.ArrayList;
import java.util.List;

/**
 * Intro:
 * Project: practice
 * Date:    3/24/15
 * Author:  xujinkai
 */


public class MergeListNode {


	public static ListNode merger(ListNode lnx, ListNode lny) {


		ListNode cpx = lnx;
		ListNode cpy = lny;

		ListNode head = null;
		ListNode current = null;


		while (cpx != null && cpy != null) {

			if (cpx.getVal() < cpy.getVal() || cpx.getVal() == cpy.getVal()) {

				if (head == null) {
					head = cpx;
					current = cpx;
				} else {
					current.setNext(cpx);
					current = cpx;
				}
				cpx = current.getNext();
			} else {
				if (head == null) {
					head = cpy;
					current = cpy;
				} else {
					current.setNext(cpy);
					current = cpy;
				}
				cpy = current.getNext();
			}

		}

		if (cpx == null && cpy != null) {
			current.setNext(cpy);
		} else if (cpx != null && cpy == null) {
			current.setNext(cpx);
		}

		return head;
	}


	public static void main(String[] args) {
		ListNode lnx = new ListNode(1);
		ListNode ln1x = new ListNode(2);
		lnx.setNext(ln1x);
		ListNode ln2x = new ListNode(4);
		ln1x.setNext(ln2x);
		ln2x.setNext(lnx);


		List<ListNode> list = new ArrayList<ListNode>();
		int i = 0;
		while (lnx != null) {
			list.add(lnx);
			lnx = lnx.getNext();
			System.out.println(i++);
			if (list.contains(lnx)) {
				System.out.println("This table is circuit!");
				break;
			}

		}


//		ListNode lny = new ListNode(3);
//		ListNode ln1y = new ListNode(5);
//		lny.setNext(ln1y);
//		ListNode ln2y = new ListNode(6);
//		ln1y.setNext(ln2y);
//
//		ListNode head = MergeListNode.merger(lnx,lny);
//
//		while(head != null){
//			System.out.print(head.getValue()+"-->");
//			head = head.getNext();
//		}


	}


}