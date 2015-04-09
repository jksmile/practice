package com.xjk.practice.listnode;

/**
 * Intro:
 * Project: practice
 * Date:    4/4/15
 * Author:  xujinkai
 */


public class DelNode {


	public static void main(String[] args) {


		ListNode headNode = new ListNode(1);
		ListNode secondNode = new ListNode(2);
		ListNode thirdNode = new ListNode(3);
		ListNode fourthNode = new ListNode(4);
		headNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		thirdNode.setNext(fourthNode);

		deleteNode(headNode,4);
	}


	public static void deleteNode(ListNode headNode,int k){

		ListNode node = headNode;

		int nodeLen = 0;
		while(node != null){
			nodeLen++;
			node = node.getNext();
		}

		if(k<1 || k > nodeLen){
			System.out.println("Out of node length!");
			return;
		}

		int position = 1;

		ListNode lastNode = null;

		ListNode currentNode = headNode;


		while (currentNode != null){

			if(k == position){

				if(lastNode == null){
					headNode = currentNode.getNext();
					break;
				}else if(currentNode.getNext() == null){
					lastNode.setNext(null);
					break;
				}else{
					lastNode.setNext(currentNode.getNext());
					break;
				}

			}

			lastNode = currentNode;

			currentNode = currentNode.getNext();

			position++;

		}

		System.out.println(headNode.getVal());


	}



	public static void delNode(ListNode headNode, ListNode targetNode){

	}

}
