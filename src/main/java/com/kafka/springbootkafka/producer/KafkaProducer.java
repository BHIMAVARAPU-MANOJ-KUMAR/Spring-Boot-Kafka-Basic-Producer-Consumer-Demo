package com.kafka.springbootkafka.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
	
	@Value("${spring.kafka.topic.name}")
    private String topicName;
	
	private final KafkaTemplate<String, String> template;
	
	public void sendMessage(String message) {
		log.info(String.format("Sending String message to demo-topic:: %s", message));
		template.send(topicName, message);
	}
}