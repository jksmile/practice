package com.xjk.practice.designmodel.abstractfactory;

/**
 * Intro:
 * Project: practice
 * Date:    4/10/15
 * Author:  xujinkai
 */


public class Xfactory implements AbstractFactory {

	@Override
	public GunProduct createGun() {
		return new AK47();
	}

	@Override
	public FighterPlanProduct createFighterPlan() {
		return new Mikoyan();
	}

	@Override
	public WarshipProduct createWarship() {
		return new Frigate();
	}
}
