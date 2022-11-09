package com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.controller;


import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.constant.KafkaConstant;
import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.model.Movie;
import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/consumer")
public class ConsumerContreoller {
    @Autowired
    private MovieService service;

    @GetMapping
    public List<Movie> getAllMovie(){
        return service.getAllMovies();
    }
}
