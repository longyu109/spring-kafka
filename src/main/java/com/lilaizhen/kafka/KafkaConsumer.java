package com.lilaizhen.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class KafkaConsumer implements MessageListener<String, byte[]>{
	
	public void onMessage(ConsumerRecord<String,  byte[]> record) {
		//String topic = record.topic();
		//String v = record.value();
		//long offset = record.offset();
		System.out.println("收到消息-->" + record.toString());
	}
}