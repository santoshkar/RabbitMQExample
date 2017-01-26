package com.message;

import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * 
 * @author skar
 *
 */
public class Sender {
	
	private static String message = "This is some test message";
	

	public static void main(String[] argv) throws java.io.IOException, TimeoutException {
		Connection connection = null;
		Channel channel = null;
		try {
			ConnectionFactory factory = new ConnectionFactory();
			factory.setHost("localhost");
			connection = factory.newConnection();
			channel = connection.createChannel();

			channel.queueDeclare(IMessageData.QUEUE_NAME, false, false, false, null);
			channel.basicPublish("", IMessageData.QUEUE_NAME, null, message.getBytes());
			System.out.println(" [x] Sent '" + message + "'");

		} catch (TimeoutException e) {
			e.printStackTrace();
		} finally {
			channel.close();
			connection.close();
		}

	}
}