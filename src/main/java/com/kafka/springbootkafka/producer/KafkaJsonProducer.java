package com.kafka.springbootkafka.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka.springbootkafka.payload.Student;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {
	
	@Value("${spring.kafka.topic-json.name}")
	private String kafkaJsonTopicName;
	
	private final KafkaTemplate<String, Student> kafkaTemplate;
	
	public void sendMessage(Student student) {
		Message<Student> message = MessageBuilder.withPayload(student)
				.setHeader(KafkaHeaders.TOPIC, kafkaJsonTopicName)
				.build();
		
		kafkaTemplate.send(message);
	}
}