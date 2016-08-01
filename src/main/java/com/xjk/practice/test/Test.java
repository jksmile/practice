package com.xjk.practice.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class A implements  Runnable{


    private SingtonTest x;

    private int a;

    public A(SingtonTest singtonTest, int a){

        this.x = singtonTest;

        this.a = a;
    }

    @Override
    public void run() {

        x.setX((long)a);

        x.getX(a);

    }
}


public class Test {

    private static Boolean switchx;


    private BigDecimal g;

    public static void main(String[] args) {


//        SingtonTest x = SingtonTest.getInstance();
//
//        SingtonTest y = SingtonTest.getInstance();


        SingtonTest x = new SingtonTest();

        SingtonTest y = new SingtonTest();

        A a1 = new A(x,-1);

        new Thread(a1).run();

        System.out.println("-------");

        A a2 = new A(y,1);

        new Thread(a2).run();


    }

    public static void testCollector(){

        List<TestBean> testBeanList = new ArrayList<>();

        testBeanList.add(new TestBean("JK",18,1));

        testBeanList.add(new TestBean("XJK",18,2));

        testBeanList.add(new TestBean("Xu",18,2));

        testBeanList.add(new TestBean("JK",18,2));




        List<Map.Entry<Integer, Map<String, List<TestBean>>>> a =

                testBeanList.stream().collect(Collectors.groupingBy(TestBean::getAge, Collectors.groupingBy
                        (TestBean::getName))).entrySet().stream().collect(Collectors.toList());

        Map<String, List<TestBean>> b = a.get(0).getValue();

        Iterator<Map.Entry<String, List<TestBean>>> x = b.entrySet().iterator();


        while (x.hasNext()){
            Map.Entry<String, List<TestBean>> y = x.next();
            System.out.println(y.getKey()+"---"+y.getValue().get(0).getName()+"--"+y.getValue().get(0).getAge());
        }

        System.out.println("ok");
    }




    public static void plus(int X){

        X += 1;
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



    static class Customer {

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        private int id;

        private String name;

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
    }


}
