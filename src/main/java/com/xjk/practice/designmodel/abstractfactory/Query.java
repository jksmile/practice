package com.xjk.practice.designmodel.abstractfactory;

/**
 * Intro:
 * Project: practice
 * Date:    4/10/15
 * Author:  xujinkai
 */


public class Query {


	public static void main(String[] args) {

		AbstractFactory factory = new Xfactory();

		factory.createGun().intruction();

		factory.createFighterPlan().intruction();

		factory.createWarship().intruction();
	}
}
