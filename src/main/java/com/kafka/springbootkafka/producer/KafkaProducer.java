package com.kafka.springbootkafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
	
	private final KafkaTemplate<String, String> template;
	
	public void sendMessage(String message) {
		log.info(String.format("Sending message to demo-topic:: %s", message));
		template.send("demo-topic", message);
	}
}