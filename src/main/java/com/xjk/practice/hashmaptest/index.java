package com.xjk.practice.hashmaptest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Intro:
 * Project: practice
 * Date:    3/9/15
 * Author:  xujinkai
 */


public class index {



	public static void main(String[] args) {

		if(true && false || false && true){
			System.out.println("Xxx");
		}
	}


	private static AtomicInteger idx = new AtomicInteger(0);

	public static void hashsettest(){




		Set set = new HashSet();

		set.add("xjk");
		set.add("zzq");
		set.add("zp");
		set.add("xjk");

		System.out.println(set.size());


		List list = new ArrayList();
		list.add("xjk");
		list.add("zzq");

		set.addAll(list);

		System.out.println(set.size());

	}



}
