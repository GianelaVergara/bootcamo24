package com.nttdata.botcamp.botcamboot.service;
import com.nttdata.botcamp.botcamboot.model.Transaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServiceTransaction {

    public Flux<Transaction> findByAccountId(String accountId);
    public Flux<Transaction> findAll();

    public Mono<Transaction> createTransaction(Transaction transaction);
    public Mono<Transaction> updateTransaction(Transaction transaction);
    public Mono<Transaction> deleteTransaction(String id);
    public Mono<Transaction> getTransaction(String id);

    public Mono<Transaction> insertTransaction(Transaction transaction);
}
