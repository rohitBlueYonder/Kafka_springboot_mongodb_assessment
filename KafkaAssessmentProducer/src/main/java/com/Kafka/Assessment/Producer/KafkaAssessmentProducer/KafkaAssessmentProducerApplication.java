package com.Kafka.Assessment.Producer.KafkaAssessmentProducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaAssessmentProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaAssessmentProducerApplication.class, args);
	}

}
