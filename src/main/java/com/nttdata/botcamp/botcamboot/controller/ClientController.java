package com.nttdata.botcamp.botcamboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nttdata.botcamp.botcamboot.model.client;
import com.nttdata.botcamp.botcamboot.service.IServiceClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")

public class ClientController {
    @Autowired
    private IServiceClient  serviceClient;



    @PostMapping
    public Mono<client> save(@RequestBody client Client){
        return serviceClient.save(Client);
    }

    @PutMapping
    public Mono<client> update(@RequestBody client Client){
        return serviceClient.update(Client);
    }

    @DeleteMapping
    public Mono<Void> delete(@PathVariable("id") Integer id){
        return serviceClient.delete(id);
    }
}
