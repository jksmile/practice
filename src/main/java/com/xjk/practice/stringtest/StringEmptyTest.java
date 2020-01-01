package com.xjk.practice.stringtest;

import org.apache.commons.lang.StringUtils;

/**
 * @author xujinkai
 * @date 2016/11/25
 */

public class StringEmptyTest {

    public static void main(String[] args) {

        String a = "  ";



        if ( StringUtils.isBlank(a)){

            System.out.println("ok");
        }
    }


}
