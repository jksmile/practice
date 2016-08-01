package com.xjk.practice.hashtabletest;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * @date: 2016/05/03
 * @author: xujinkai
 */

public class Test {

    public static void main(String[] args) {

        Integer a = null;

        int b = a;

        System.out.println(b);

    }



    public static void testHashBasedTable(){


        Table<String, Integer, String> aTable = HashBasedTable.create();

        for (char a = 'A'; a <= 'C'; ++a) {
            for (Integer b = 1; b <= 3; ++b) {
                aTable.put(Character.toString(a), b, String.format("%c%d", a, b));
            }
        }

        System.out.println(aTable.toString());

        System.out.println(aTable.row("A").size());

        System.out.println(aTable.toString());
    }


}
