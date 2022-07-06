package com.nttdata.botcamp.botcamboot.service;
import  com.nttdata.botcamp.botcamboot.model.client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface IServiceClient {

    Flux<client> findAll();
    Mono<client> save(client Client);
    Mono<client> update(client Client);

    Flux<client> findClientByDNI(String dni);

    Mono<Void> delete(Integer Client);
}
