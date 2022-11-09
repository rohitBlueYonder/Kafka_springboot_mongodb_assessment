package com.Kafka.Assessment.Producer.KafkaAssessmentProducer.controller;

import com.Kafka.Assessment.Producer.KafkaAssessmentProducer.constant.KafkaConstant;
import com.Kafka.Assessment.Producer.KafkaAssessmentProducer.model.Movie;
import com.Kafka.Assessment.Producer.KafkaAssessmentProducer.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/producer")
public class ProducerController {
    @Autowired
    private KafkaTemplate<String, Movie> kafkaTemplate;

    @Autowired
    private MovieService service;

    @PostMapping(value = "/add",consumes = "application/json",produces = "application/json")
    public void send(@RequestBody Movie movie){
        System.out.println(movie);
        service.addMovie(movie);
        movie.setCreationDate(LocalDateTime.now().toString());
        try{
            kafkaTemplate.send(KafkaConstant.TOPIC,movie).get();
        }
        catch (InterruptedException | ExecutionException exception){
            throw new RuntimeException(exception);
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }

    @GetMapping
    public List<Movie> getAllMovie(){
        return service.getAllMovies();
    }
}
