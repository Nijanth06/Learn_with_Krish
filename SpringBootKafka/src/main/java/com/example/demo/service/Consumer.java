package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
  
	@KafkaListener(topics="kafkatopic", groupId="kafkagroup")
	public void consumeFromTopic(String message) {
		System.out.println(message);
	}
}
