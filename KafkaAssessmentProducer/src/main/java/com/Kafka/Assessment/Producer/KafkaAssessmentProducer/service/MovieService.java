package com.Kafka.Assessment.Producer.KafkaAssessmentProducer.service;

import com.Kafka.Assessment.Producer.KafkaAssessmentProducer.model.Movie;
import com.Kafka.Assessment.Producer.KafkaAssessmentProducer.repository.MovieRepository;
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

    public void addMovie(Movie movie){ repository.save(movie);}

}
