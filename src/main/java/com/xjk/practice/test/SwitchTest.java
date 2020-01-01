package com.xjk.practice.test;

/**
 * @date: 2016/08/22
 * @author: xujinkai
 */

public class SwitchTest {


    public enum FruitEnum{

        APPLE("apple","red"),

        ORANGE("orange","orange");


        private FruitEnum(String fruitName, String fruitColor) {
            this.fruitName = fruitName;
            this.fruitColor = fruitColor;
        }

        private String fruitName;

        private String fruitColor;


    }

    public static void main(String[] args) {



        int a = 2;


        switch (a){

            case 1:
                System.out.println("apple.");

            case 2:
                System.out.println("orange.");


            case 3:
                System.out.println("water");

            default:
                System.out.println("Fruit!");
                break;
        }




    }





}
