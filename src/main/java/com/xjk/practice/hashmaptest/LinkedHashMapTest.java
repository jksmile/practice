package com.xjk.practice.hashmaptest;

import com.sun.tools.jdi.LinkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Intro:
 * Project: practice
 * Date:    3/11/15
 * Author:  xujinkai
 */


public class LinkedHashMapTest {

	private static LinkedHashMap linkedHashMap;

	private static HashMap hashMap;

	public static void main(String[] args) {
		linkedHashMapTest();

		hashMapTest();
	}



	public static void linkedHashMapTest(){

		linkedHashMap = new LinkedHashMap();

		linkedHashMap.put("x", "xjk");
		linkedHashMap.put("z","zp");
		linkedHashMap.put("d","dqk");

		Iterator temp = linkedHashMap.entrySet().iterator();

		while (temp.hasNext()){
			Map.Entry el = (Map.Entry) temp.next();
			System.out.println(el.getKey()+"------"+el.getValue());
		}

	}

	public static void hashMapTest(){
		hashMap = new HashMap();

		hashMap.put("x", "xjk");
		hashMap.put("z","zp");
		hashMap.put("d","dqk");
		Iterator temp = hashMap.entrySet().iterator();

		while (temp.hasNext()){
			Map.Entry el = (Map.Entry) temp.next();
			System.out.println(el.getKey()+"------"+el.getValue());
		}

	}

}
