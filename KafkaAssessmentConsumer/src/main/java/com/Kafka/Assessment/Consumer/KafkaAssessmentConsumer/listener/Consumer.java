package com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.listener;

import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.constant.KafkaConstant;
import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.model.Movie;
import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    MovieRepository repository;

    @KafkaListener(topics = KafkaConstant.TOPIC, groupId = KafkaConstant.GROUP_ID)
    public void consume(Movie movie){
        System.out.println(movie);
        repository.save(movie);
    }

}
