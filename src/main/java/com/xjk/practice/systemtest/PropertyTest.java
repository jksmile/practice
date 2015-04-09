package com.xjk.practice.systemtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/**
 * Intro:
 * Project: practice
 * Date:    3/4/15
 * Author:  xujinkai
 */


public class PropertyTest {


	private static String configFile = "config.xml";


	public static void main(String[] args) {


		configFile = System.getProperty("config.conf",configFile);

		System.out.println(configFile);

		URL url = PropertyTest.class.getResource("/"+configFile);

		System.out.println(url.getPath());

		File fileContent = new File(url.getPath());


		System.out.println(fileContent);

		if(fileContent.exists()){
			System.out.println("Already find the file.");
		}

		try {
			fileContent = fileContent.getCanonicalFile();
			System.out.println(fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}


		try {
			FileInputStream conf = new FileInputStream(fileContent);
			System.out.println(conf);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}



	}
}
