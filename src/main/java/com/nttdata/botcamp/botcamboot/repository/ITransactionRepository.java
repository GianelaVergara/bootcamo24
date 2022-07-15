package com.nttdata.botcamp.botcamboot.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.nttdata.botcamp.botcamboot.model.Transaction;
import reactor.core.publisher.Flux;

public interface ITransactionRepository extends ReactiveMongoRepository<Transaction, String> {

    public Flux<Transaction> findByAccountId(String accountId);

}