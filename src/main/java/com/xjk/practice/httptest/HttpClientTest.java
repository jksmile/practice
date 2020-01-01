package com.xjk.practice.httptest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * @author xujinkai
 * @date 2017/02/28
 */

public class HttpClientTest {

    private static HttpClient httpClient = new HttpClient();

    private static final String LOGIN_URL = "https://uuap.baidu.com/login";

    private static final String PATTERN = "<input type=\"hidden\" name=\"(.*?)\" value=\"(.*?)\" />";

    public static void main(String[] args){

        String content = getPage(null);

        login(content);

        String wiki = getPage("http://wiki.baidu.com");

        System.out.println(wiki);


        String noah = getPage("http://noah.baidu.com");

        System.out.println(noah);



    }


    public static String getPage(String url){

        GetMethod getMethod;

        if(url == null) {
            getMethod = new GetMethod(LOGIN_URL);
        }else{
            getMethod = new GetMethod(url);

        }

        getMethod.addRequestHeader("Content-Type", "text/html; charset=UTF-8");

        try {
            httpClient.executeMethod(getMethod);

            return getMethod.getResponseBodyAsString();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void login(String content){

        Pattern r = Pattern.compile(PATTERN);

        Matcher matcher = r.matcher(content);

        List<NameValuePair> paramList = new ArrayList<>();

        while (matcher.find()){

            paramList.add(new NameValuePair(matcher.group(1),matcher.group(2)));
        }


        paramList.add(new NameValuePair("username","xujinkai"));

        paramList.add(new NameValuePair("password","xjk4047218?"));

        PostMethod postMethod = new PostMethod(LOGIN_URL);

        NameValuePair[] xx = new NameValuePair[5];


        for (int i=0; i< paramList.size(); i++){

            xx[i] = paramList.get(i);
        }

        postMethod.setRequestBody(xx);

        try {
            httpClient.executeMethod(postMethod);

            String res = postMethod.getResponseBodyAsString();

            System.out.println(postMethod.getStatusLine().getStatusCode());

            System.out.println(postMethod.getStatusCode());

            System.out.println(postMethod.getQueryString());

            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("ok");

    }





}
