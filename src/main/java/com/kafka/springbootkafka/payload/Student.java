package com.kafka.springbootkafka.payload;

import lombok.Data;

@Data
public class Student {
	
	private Integer id;
	private String firstName;
	private String lastName;
}