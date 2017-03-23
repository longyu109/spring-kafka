package com.linkstec.mot.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class KafkaConsumerService implements MessageListener<String, byte[]> {

	public void onMessage(ConsumerRecord<String, byte[]> record) {
		System.out.println("============="+record);
	}

}
