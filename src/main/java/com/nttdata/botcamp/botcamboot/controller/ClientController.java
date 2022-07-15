package com.nttdata.botcamp.botcamboot.controller;

import com.nttdata.botcamp.botcamboot.service.IServiceClient;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import  com.nttdata.botcamp.botcamboot.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/Clients")
@Slf4j
public class ClientController {
    @Autowired
    private IServiceClient iServiceClient;

    @GetMapping("/")
    public Flux<Client> findAllClient(){
        return iServiceClient.findAll();
    }


    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Client>> deleteClient(@PathVariable("id") String id){
        return iServiceClient.deleteClient(id).flatMap(response -> Mono.just(ResponseEntity.ok(response)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Client>> getClientById(@PathVariable("id") String id){

        return iServiceClient.getClient(id).flatMap(response -> Mono.just(ResponseEntity.ok(response)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }


}
