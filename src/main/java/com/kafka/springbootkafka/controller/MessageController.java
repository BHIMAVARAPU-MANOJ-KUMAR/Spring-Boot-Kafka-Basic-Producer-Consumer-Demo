package com.kafka.springbootkafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.springbootkafka.payload.Student;
import com.kafka.springbootkafka.producer.KafkaJsonProducer;
import com.kafka.springbootkafka.producer.KafkaProducer;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

	private final KafkaProducer kafkaProducer;
	
	private final KafkaJsonProducer jsonProducer;
	
	@PostMapping
	public ResponseEntity<String> sendMessage(@RequestBody String message) {
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("String Message Queued Successfully.");
	}
	
	@PostMapping("/json")
	public ResponseEntity<String> sendJsonMessage(@RequestBody Student student) {
		jsonProducer.sendMessage(student);
		return ResponseEntity.ok("Json Message Queued Successfully.");
	}
}