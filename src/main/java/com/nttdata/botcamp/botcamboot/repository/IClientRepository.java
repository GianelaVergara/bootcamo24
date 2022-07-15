package com.nttdata.botcamp.botcamboot.repository;


import  com.nttdata.botcamp.botcamboot.model.Client;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface IClientRepository extends ReactiveCrudRepository<Client,String> {

    Flux<Client> findByClientId(String id);
}
