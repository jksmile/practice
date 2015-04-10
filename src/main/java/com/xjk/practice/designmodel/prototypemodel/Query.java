package com.xjk.practice.designmodel.prototypemodel;

/**
 * Intro:
 * Project: practice
 * Date:    4/10/15
 * Author:  xujinkai
 */


public class Query {

	public static void main(String[] args) {

		IntanceType intanceType = new IntanceType();



			IntanceType c1 = (IntanceType) intanceType.clone();

			c1.show();

			c1.setA(100);
			c1.setB("First");
			String[] tmp=c1.getC();
			tmp[0] = "X";
			c1.setC(tmp);

			System.out.println(c1.getA());
			System.out.println(c1.getB());
			System.out.println(c1.getC());

			IntanceType c2 = (IntanceType) c1.clone();

			c2.setA(1000);
			c2.setB("Second");
			String[] tmp1=c2.getC();
			tmp1[0] = "Y";
			c2.setC(tmp1);

			System.out.println(c1.getA());
			System.out.println(c2.getA());


			System.out.println(c1.getB());
			System.out.println(c2.getB());

		System.out.println(c1.getC());
		System.out.println(c2.getC());

	}
}
