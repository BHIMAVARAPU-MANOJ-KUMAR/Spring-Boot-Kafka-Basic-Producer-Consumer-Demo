package com.kafka.springbootkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.springbootkafka.payload.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
	
//	@KafkaListener(topics = "demo-topic", groupId = "myDemoGroup")
//	public void consumeMessage(String message) {
//		log.info(String.format("Consuming message from demo-topic:: %s", message));
//	}
	
	@KafkaListener(topics = "demo-topic", groupId = "myDemoGroup")
	public void consumeJsonMessage(Student student) {
		log.info(String.format("Consuming message from demo-topic:: %s", student.toString()));
	} 
}