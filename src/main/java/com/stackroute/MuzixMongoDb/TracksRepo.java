package com.stackroute.MuzixMongoDb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TracksRepo extends MongoRepository<Tracks,Integer> {

}
