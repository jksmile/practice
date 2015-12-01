package com.xjk.practice.rabbitmqtest;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * Intro:
 * Project: practice
 * Date:    12/1/15
 * Author:  xujinkai
 */


public class Send {


	private final static String QUEUE_NAME = "test02";

	public static void main(String[] args) throws IOException {

		ConnectionFactory factory = new ConnectionFactory();

		factory.setHost("115.29.230.190");

		factory.setUsername("xujinkai");

		factory.setPassword("xujinkai");

		factory.setPort(5672);

		factory.setConnectionTimeout(3000);

		Connection connect = factory.newConnection();

		Channel channel = connect.createChannel();

		channel.queueDeclare(QUEUE_NAME,false,false,false,null);

		long now = System.currentTimeMillis();

		for(int i=0; i<100000; i++) {

			String message = "Just test.->"+i;

			channel.basicPublish("", QUEUE_NAME, null, message.getBytes());

			System.out.println(" [x] Sent '" + message + "'");

		}
		System.out.println((System.currentTimeMillis()-now)/1000);

		channel.close();

		connect.close();


	}
}
