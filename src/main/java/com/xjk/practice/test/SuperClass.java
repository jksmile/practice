package com.xjk.practice.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @date: 2016/04/26
 * @author: xujinkai
 */

public class SuperClass {

    public static void main(String[] args) {

        List<Testx> testxList = new ArrayList<Testx>();

        Testx x = new Testx();
        x.setId(1);
        x.setNick("jk");

        testxList.add(x);

        Testx y = new Testx();
        y.setId(2);
        y.setNick("klip");

        testxList.add(y);

        convertListToMap(testxList,"nick");
    }



    /**
     * List 转 Map
     *
     * @param <T> tList
     *
     * @param fieldNameList
     *
     * @return Map<String,T>
     */
    public static final <T> Map<String,T> convertListToMap(List<T> tList, Object... fieldNameList){

        if(null == tList) return null;

        HashMap<String,T> map = new HashMap<String,T>();

        for (T t : tList){

            String key = createKey(t,fieldNameList);

            map.put(key,t);

        }

        return map;
    }

    /**
     * 创建KEY
     *
     * @param t
     *
     * @param fieldNameList
     *
     * @return String
     */
    public static final <T> String createKey(T t, Object... fieldNameList){

        if(fieldNameList.length == 0){

            // Todo. Throw exception.
        }

        StringBuffer keyBuf = new StringBuffer();

        for (Object fieldName : fieldNameList){

            String fieldNameStr = (String) fieldName;

            String method  = "get"+fieldNameStr.substring(0, 1).toUpperCase() + fieldNameStr.substring(1);

            try {

                Object val = t.getClass().getMethod(method, null).invoke(t, null);

                keyBuf.append(((String) val)).append("-");

            } catch (IllegalAccessException e) {

                e.printStackTrace();
            } catch (InvocationTargetException e) {

                e.printStackTrace();
            } catch (NoSuchMethodException e) {

                e.printStackTrace();
            }
        }

        return keyBuf.substring(0,keyBuf.length()-1).toString();


    }


}


class Testx{

    private int id;

    private String nick;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}