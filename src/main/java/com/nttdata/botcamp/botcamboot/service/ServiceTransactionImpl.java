package com.nttdata.botcamp.botcamboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.botcamp.botcamboot.model.Transaction;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.nttdata.botcamp.botcamboot.model.BankAccount;
import com.nttdata.botcamp.botcamboot.model.Credit;

@Service
public class ServiceTransactionImpl implements IServiceTransaction {

    @Autowired
    private IServiceTransaction iTransactionRepository;


    @Override
    public Flux<Transaction> findByAccountId(String accountId) {
        return iTransactionRepository.findByAccountId(accountId);
    }

    @Override
    public Flux<Transaction> findAll() {
        return iTransactionRepository.findAll();
    }

    @Override
    public Mono<Transaction> createTransaction(Transaction transaction) {

        if(transaction.getTypeTransaction().equals("B")) {
            return apiCall.putDepositBankAccount(transaction.getAccountId(), transaction.getAmount())
                    .flatMap(currentAccount -> {
                        if (!currentAccount.getId().equals("-1")) {
                            System.out.println("Se realizó la transacción con un valor de " + transaction.getAmount() + " de la cuenta " +
                                    currentAccount.getBankAccountNumber() + " de tipo " + currentAccount.getAccountType());
                            return transactionRepository.save(transaction);}
                        else return Mono.empty();
                    });
        } else {

            return apiCall.putDepositCredit(transaction.getAccountId(), transaction.getAmount())
                    .flatMap(currentCredit -> {
                        if (!currentCredit.getId().equals("-1")) {
                            System.out.println("Se realizó la transacción con un valor de " + transaction.getAmount() + " del crédito " +
                                    currentCredit.getCreditAccountNumber() + " de tipo " + currentCredit.getCreditType());
                            return transactionRepository.save(transaction);
                        }
                        else return Mono.empty();
                    });
        }
    }

    @Override
    public Mono<Transaction> insertTransaction(Transaction transaction){
        return iTransactionRepository.save(transaction);
    }

    @Override
    public Mono<Transaction> updateTransaction(Transaction transaction) {
        return getTransaction(transaction.getId())
                .flatMap(eTransaction -> {
                    eTransaction.setDescription(transaction.getDescription());
                    return iTransactionRepository.save(eTransaction);
                });
    }

    @Override
    public Mono<Transaction> deleteTransaction(String id) {
        return getTransaction(id).flatMap(c -> iTransactionRepository.deleteById(c.getId()).thenReturn(c));
    }

    @Override
    public Mono<Transaction> getTransaction(String id) {
        return iTransactionRepository.findById(id);
    }
}
