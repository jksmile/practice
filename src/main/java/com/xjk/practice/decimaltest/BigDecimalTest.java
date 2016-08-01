package com.xjk.practice.decimaltest;

import java.math.BigDecimal;

/**
 * Date:    4/6/16
 * <p/>
 * Author:  xujinkai
 */


public class BigDecimalTest {

	public static void main(String[] args) {


				new BigDecimal("100");

				BigDecimal x = BigDecimal.valueOf(1);



				double d = 20014999;
				long l = Double.doubleToLongBits(d);
				System.out.println(Long.toBinaryString(l));
				float f = 20014999;
				int i = Float.floatToIntBits(f);
				System.out.println(Integer.toBinaryString(i));

	}


	public static void test(){

		System.out.println(0.05+0.01);
		System.out.println(1.0 - 0.42);
		System.out.println(4.015 * 100);
		System.out.println(123.3 / 100);

	}


	public static void testRoundHalfEven(){


		for(int i=0; i<100; i++){

			double tmpVal = Math.ceil(Math.random()*1000)/100;

			System.out.println(tmpVal);

			if(((tmpVal*100)%10)%10==5) {
				System.out.println(tmpVal);

				BigDecimal tmpValX = new BigDecimal(tmpVal);

//			BigDecimal test = tmpValX.setScale(1,BigDecimal.ROUND_HALF_EVEN);

				System.out.println(tmpValX.setScale(1, BigDecimal.ROUND_HALF_EVEN));

				System.out.println("--------------");
			}
		}

	}
}
