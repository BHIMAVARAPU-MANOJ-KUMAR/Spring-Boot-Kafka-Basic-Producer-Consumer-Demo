package com.kafka.springbootkafka.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Value("${spring.kafka.topic.name}")
	private String kafkaTopicName;
	
	@Value("${spring.kafka.topic-json.name}")
	private String kafkaJsonTopicName;
	
	@Bean
	NewTopic demoTopic() {
		return TopicBuilder
				.name(kafkaTopicName)
				.build();
	}
	
	@Bean
	NewTopic demoJsonTopic() {
		return TopicBuilder
				.name(kafkaJsonTopicName)
				.build();
	}
}