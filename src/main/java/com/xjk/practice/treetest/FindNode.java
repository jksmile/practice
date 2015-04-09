package com.xjk.practice.treetest;

/**
 * Intro:
 * Project: practice
 * Date:    3/29/15
 * Author:  xujinkai
 */


public class FindNode{


	/**
	 * param: pos. From Last to head. start with 1.
	 *
	 */
	public static void findNodeFromLastA(SingleTrackTree X, int pos){

		long startTime = System.currentTimeMillis();

		SingleTrackTree head = X;

		SingleTrackTree temp = null;

		int tempCount = 0;


		while(X != null){

			tempCount++;

			if( pos == tempCount){

				temp = head;

			}

			if(temp !=null && X.getNext() != null){

				temp = temp.getNext();
			}

			X = X.getNext();

		}

		if(temp == null){

			System.out.println("The X is null");

		}else{

			System.out.println("From last to head position: "+pos+"'s value is -> "+temp.getVal());

		}

		System.out.println("A project Spend time: "+String.valueOf(System.currentTimeMillis()-startTime));

	}


	public static void main(String[] args){

		int treeLength = 10000000;

		int pos = 1000;
		SingleTrackTree rootTree = null;

		for(int i=treeLength;i>0;i--){
			if(rootTree == null){
				rootTree = new SingleTrackTree(i,null);
			}else{
				rootTree = new SingleTrackTree(i,rootTree);
			}

		}


		findNodeFromLastA(rootTree,pos);

		System.out.println("---------------------");

		findNodeFromLastB(rootTree,pos);

	}



	public static void findNodeFromLastB(SingleTrackTree X, int pos){

		long startTime = System.currentTimeMillis();

		SingleTrackTree head = X;

		if( X == null){
			System.out.println("The X is null");
		}else{

			int treeLength = 0;

			while(X != null){

				treeLength++;

				X = X.getNext();

			}

			int tempNum = 0;

			int posFromHead = treeLength-pos;

			while(head != null){

				if(tempNum == posFromHead){

					System.out.println("From last to head position: " + pos + "'s value is -> " + head.getVal());

					break;

				}

				tempNum++;

				head = head.getNext();
			}


		}

		System.out.println("B project spend time: "+String.valueOf(System.currentTimeMillis()-startTime));

	}



}

