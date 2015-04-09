package com.xjk.practice.listnode;

/**
 * Intro:
 * Project: practice
 * Date:    3/25/15
 * Author:  xujinkai
 */

public class InsertNode{

	public static void insert(ListNode ln, ListNode extNode, int num){

		int len = 0;
		ListNode cp = ln;
		while( cp != null){
			len++;
			cp = cp.getNext();
		}

		if(num >= 1 && num <= len+1){

			ListNode current = null;

			int position =1;
			ListNode head = null;
			while(true){
				if(position==1){
					head = ln;
				}
				if(position == num){
					if(num == 1){

						extNode.setNext(ln);
						head = extNode;
						break;
					}else if(num == len+1){
						current.setNext(extNode);
						break;
					}else{
						current.setNext(extNode);
						extNode.setNext(ln);
						break;
					}
				}

				position++;
				current = ln;
				ln = ln.getNext();
			}
			printResult(head);
		}else{
			System.out.println("The node num is invalid");
		}
	}



	public static void main(String[] args){

		ListNode lnx = new ListNode(1);
		ListNode ln1x = new ListNode(2);
		lnx.setNext(ln1x);
		ListNode ln2x = new ListNode(5);
		ln1x.setNext(ln2x);


		ListNode lny = new ListNode(100);
		//Error examples.
		//InsertNode.insert(lnx,lny,10);
		//InsertNode.insert(lnx,lny,0);

		//Valid examples.
		//InsertNode.insert(lnx,lny,1);
		//InsertNode.insert(lnx,lny,3);
		InsertNode.insert(lnx,lny,4);

	}

	public static void printResult(ListNode list){

		while(list != null){
			System.out.print(list.getVal()+"->");
			list = list.getNext();
		}
	}

}




