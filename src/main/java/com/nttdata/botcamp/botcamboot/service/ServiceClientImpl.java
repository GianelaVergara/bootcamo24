package com.nttdata.botcamp.botcamboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import  com.nttdata.botcamp.botcamboot.model.client;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceClientImpl implements IServiceClient {

    @Autowired
    IServiceClient serviceClient;

    @Override
    public Flux<client> findAll()
    {
        return  serviceClient.findAll();
    }

    @Override
    public Mono<client> save(client Client) {
        return  serviceClient.save(Client);
    }

    @Override
    public Mono<client> update(client Client) {
        return  null;
    }

@Override
public Flux<client> findClientByDNI(String dni)
{
    return  serviceClient.findAll().filter(x->x.getNumberDoc().equals(dni));
}

    @Override
    public Mono<Void> delete(Integer id_Client) {
        return  null;
    }
}
