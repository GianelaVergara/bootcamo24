package com.nttdata.botcamp.botcamboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import com.nttdata.botcamp.botcamboot.model.Client;
import reactor.core.publisher.Mono;
@Service
@Slf4j
public class ServiceClientImpl implements IServiceClient {

    @Autowired
    private IServiceClient iserviceClient;


    @Override
    public Mono<Client> findByDni(String numberDOc) {
        return iserviceClient.findByDni(numberDOc);
    }

    @Override
    public Flux<Client> findByClientType(Integer typeClient) {
        return iserviceClient.findByClientType(typeClient);
    }

    @Override
    public Flux<Client> findAll() {
        return iserviceClient.findAll();
    }



    @Override
    public Mono<Client> deleteClient(String id) {
        return getClient(id).flatMap(c -> iserviceClient.deleteClient(c.getId()).thenReturn(c));
    }

    @Override
    public Mono<Client> getClient(String id) {

        return iserviceClient.findByDni(id);
    }


}
