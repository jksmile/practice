package com.xjk.practice.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yongche on 15/8/12.
 */
public class Test {

    private static Boolean switchx;


    public static void main(String[] args) {


        float a = 0.4f;

        if(a >0.4){

            System.out.println("OK");
        }else if(a<0.4){
            System.out.println("OKK");
        }else if(a == 0.4){

            System.out.println("Got");
        }

        double b = 0.4f;


        System.out.println(a+"--"+b);


    }


    public static void compareArrayListVSLinkedList(){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Long startBuild = System.currentTimeMillis();

        for(int i=0; i<=1000000; i++){
            arr.add(i);
        }

        System.out.println("End Build:"+Long.toString(System.currentTimeMillis()-startBuild));


        Long startGet = System.currentTimeMillis();

        int arrNum = arr.get(500000);

        System.out.println("Arr END GET:"+Long.toString(System.currentTimeMillis()-startGet));




        LinkedList<Integer> link = new LinkedList<Integer>();

        Long startLinkBuild = System.currentTimeMillis();

        for(int i=0; i<1000000;i++){

            link.add(i);
        }

        System.out.println("End Link Build:"+Long.toString(System.currentTimeMillis()-startLinkBuild));


        Long startLinkGet = System.currentTimeMillis();

        int linkNum = link.get(500000);

        System.out.println("Link END GET:"+Long.toString(System.currentTimeMillis()-startLinkGet));

    }

}
