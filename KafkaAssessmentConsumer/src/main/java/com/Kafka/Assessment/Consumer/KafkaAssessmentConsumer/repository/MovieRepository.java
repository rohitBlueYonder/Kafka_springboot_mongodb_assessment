package com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.repository;

import com.Kafka.Assessment.Consumer.KafkaAssessmentConsumer.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
