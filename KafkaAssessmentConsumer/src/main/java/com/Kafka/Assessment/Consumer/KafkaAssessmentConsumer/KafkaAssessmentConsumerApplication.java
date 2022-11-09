package com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer;

import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaAssessmentConsumerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaAssessmentConsumerApplication.class, args);
	}

}
