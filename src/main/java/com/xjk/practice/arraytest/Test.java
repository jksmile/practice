package com.xjk.practice.arraytest;

import java.util.Arrays;

/**
 * Intro:
 * Project: practice
 * Date:    11/15/15
 * Author:  xujinkai
 */


public class Test{

	public static void main(String[] args) {

//		copyArr();
		try {
			cloneArr();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}



	public static void copyArr(){

		int[] arr1 = new int[]{1,2,3};

		int[] arr2 = arr1;

		int[] arr3 = arr1.clone();

		arr2[4] = 100;

		System.out.printf(arr1.toString()+"--"+Arrays.toString(arr1));


		System.out.println("\n");

		System.out.println(arr2.toString()+"--"+Arrays.toString(arr2));

		System.out.println("\n");

		System.out.printf(arr3.toString()+"--"+Arrays.toString(arr3));
	}



	public static void cloneArr() throws CloneNotSupportedException {

		OriginObj originObj = new OriginObj(1,"jk",new Family("aaaa","bbbb"));

		OriginObj targetObj = originObj.clone();

		System.out.println(originObj+"--"+originObj.toString());

		System.out.println("\n");

		System.out.println(targetObj+"--"+targetObj.toString());

		System.out.println(originObj.getFamily().equals(targetObj.getFamily()));

	}


}

class OriginObj implements Cloneable{

	private int id;

	private String name;

	private Family family;


	public OriginObj(int id, String name, Family family) {
		this.id = id;
		this.name = name;
		this.family = family;
	}

	@Override
	public OriginObj clone() throws CloneNotSupportedException {
		OriginObj cloned = (OriginObj) super.clone();

		return  cloned;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	@Override
	public String toString() {
		return "OriginObj{" +
				"id=" + id +
				", name='" + name + '\'' +
				", family=" + family +
				'}';
	}
}


class Family{

	private String fatherName;

	private String motherName;


	public Family(String fatherName, String motherName) {
		this.fatherName = fatherName;
		this.motherName = motherName;
	}


	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Override
	public String toString() {
		return "Family{" +
				"fatherName='" + fatherName + '\'' +
				", motherName='" + motherName + '\'' +
				'}';
	}
}