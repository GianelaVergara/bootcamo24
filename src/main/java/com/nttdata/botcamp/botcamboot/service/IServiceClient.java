package com.nttdata.botcamp.botcamboot.service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import   com.nttdata.botcamp.botcamboot.model.Client;

public interface IServiceClient {

    public Mono<Client> findByDni(String numberDOc);
    public Flux<Client> findByClientType(Integer typeClient);
    public Flux<Client> findAll();


    public Mono<Client> deleteClient(String id);
    public Mono<Client> getClient(String id);

}
