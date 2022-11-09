package com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.service;

import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.model.Movie;
import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;

    public List<Movie> getAllMovies(){
        return repository.findAll();
    }

}
