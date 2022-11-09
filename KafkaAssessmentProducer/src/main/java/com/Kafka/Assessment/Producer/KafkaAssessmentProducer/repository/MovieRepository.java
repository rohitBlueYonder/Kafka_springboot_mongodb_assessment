package com.Kafka.Assessment.Producer.KafkaAssessmentProducer.repository;

import com.Kafka.Assessment.Producer.KafkaAssessmentProducer.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
