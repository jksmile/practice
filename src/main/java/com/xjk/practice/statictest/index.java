package com.xjk.practice.statictest;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Intro:
 * Project: practice
 * Date:    3/9/15
 * Author:  xujinkai
 */


public class index {

	private static int num;

	private static HashMap hashMap = new HashMap();


	public static void testX(){
		num +=1;
	}

	public static void testY(){
		num +=1;
	}

	public static Map<String,String> testMap(String target){

		Map<String,String> mapString = new HashMap<String, String>();

		mapString.put("target",target);
		mapString.put("from","china");

		return mapString;
	}

	public static void main(String[] args) {

		System.out.println("OK");

	}


	public static void testHashMap(){
		HashMap sourceData = hashMapTest();

		Long startTimeA = System.currentTimeMillis();
		getHashValueA(sourceData);
		System.out.println("Project A"+(System.currentTimeMillis()-startTimeA));

		System.out.println();

		Long startTimeB = System.currentTimeMillis();
		getHashValueB(sourceData);
		System.out.println("Project B:"+(System.currentTimeMillis()-startTimeB));

	}

	public static HashMap hashMapTest(){

		for(int i=0; i<10000; i++){
			hashMap.put(i,"test");
		}

		return hashMap;
	}


	public static void getHashValueA(HashMap hashmap){

		Iterator iterb = hashmap.entrySet().iterator();
		while (iterb.hasNext()){
			Map.Entry entryb = (Map.Entry) iterb.next();
			System.out.println(entryb.getKey()+"--"+entryb.getValue());
		}

	}

	public static void getHashValueB(HashMap hashmap){

		Iterator iterb = hashmap.keySet().iterator();
		while (iterb.hasNext()){
			Object entryb = iterb.next();
			System.out.println(entryb.toString()+"--"+hashmap.get(entryb));
		}
	}




}
