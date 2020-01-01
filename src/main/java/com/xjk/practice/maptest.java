package com.xjk.practice;

import com.google.gson.Gson;

import net.sf.json.JSONObject;

/**
 * @author xujinkai
 * @date 2016/11/29
 */

public class maptest {

    public static void main(String[] args) {

        TestAA testA = new TestAA();

        testA.setName("百度有钱|还款");

        testA.setPrice(13000);

        testA.setId("umoney");

        testA.setNumber(1);



        Gson gson = new Gson();

        String x = "[" + gson.toJson(testA) + "]";

        System.out.println(x);

        String desc = "[" + JSONObject.fromObject(testA).toString() + "]";

        System.out.println(desc);

        System.out.println("ok");
    }

}


