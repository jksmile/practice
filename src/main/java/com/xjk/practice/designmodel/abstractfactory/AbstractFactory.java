package com.xjk.practice.designmodel.abstractfactory;

/**
 * Intro:The abstract factory model is belong creation model.
 *
 * Project: practice
 *
 * Date:    4/9/15
 *
 * Author:  xujinkai
 */


interface AbstractFactory {


		public GunProduct createGun();


		public FighterPlanProduct createFighterPlan();


		public WarshipProduct createWarship();

}
