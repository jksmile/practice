package com.xjk.practice.rabbitmqtest;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * Intro:
 * Project: practice
 * Date:    12/1/15
 * Author:  xujinkai
 */


public class Recv {


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

		channel.queueDeclare(QUEUE_NAME, false, false, false, null);

		System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

		long now = System.currentTimeMillis();


		Consumer consumer = new DefaultConsumer(channel) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
					throws IOException {
				String message = new String(body, "UTF-8");
				System.out.println(" [x] Received '" + message + "'");
			}
		};
		channel.basicConsume(QUEUE_NAME, true, consumer);

		System.out.println((System.currentTimeMillis()-now)/1000);


	}
}
