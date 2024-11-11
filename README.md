# Spring Boot Kafka Basic Producer & Consumer Demo

### This demo contains examples of `String` datatype Producer/Consumer and `JSON Object` Datatype Producer/Consumer.

### **_Basic Commands to start with Kafka -_**

- **_Step 1_** : After download and installing Kafka, `To Start the Environment`

`.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`

- **_Step 2_** : `To Start the Kafka Broker Service`

`.\bin\windows\kafka-server-start.bat .\config\server.properties`

- **_Step 3_** : `To Create a Topic to Store your Events`

`.\bin\windows\kafka-topics.bat --create --topic `**your-kafka-topic-name**` --bootstrap-server localhost:9092`

- **_Step 4_** : `To Write some Events to the Created Topic`

`.\bin\windows\kafka-console-producer.bat --topic `**your-kafka-topic-name**` bootstrap-server localhost:9092`

**_`> Hello World`_**

**_`> This is Kafka Stream Processing World`_**

- **_Step 5_** : `To Read the Events`

`.\bin\windows\kafka-console-consumer.bat --topic `**your-kafka-topic-name**` --from-beginning --bootstrap-server localhost:9092`

**_`The Messages will Printed to the Consumer Console`_**

**_`Hello World`_**

**_`This is Kafka Stream Processing World`_**

![Image of Spring Boot Kafka Project Flow Diagram](https://github.com/BHIMAVARAPU-MANOJ-KUMAR/Spring-Boot-Kafka-Basic-Producer-Consumer-Demo/blob/main/kafka_project_diagram.jpeg?raw=true)

### **_GitHub Repositories by `BOUALI Ali` & `Ramesh Fadatare - Java Guides` to Start with -_**

- **[GitHub Repository 1](https://github.com/RameshMF/springboot-kafka-course) Ramesh Fadatare - Java Guides**

- **[GitHub Repository 2](https://github.com/RameshMF/springboot-microservices) Ramesh Fadatare - Java Guides**

- **[GitHub Repository 3](https://github.com/ali-bouali/apache-kafka-with-spring-boot-reactive) Bouali Ali**
