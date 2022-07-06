package com.nttdata.botcamp.botcamboot.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import  com.nttdata.botcamp.botcamboot.model.client;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
@Repository
public interface IClientRepository extends ReactiveCrudRepository<client,Integer> {
}
