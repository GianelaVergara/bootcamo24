package com.nttdata.botcamp.botcamboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data @Builder
@NoArgsConstructor @AllArgsConstructor

public class BankAccount {

    @Id
    private String id;
    private String description;
    private String accountType;
    private Integer limitPerMonth;
    private Float commission;
    private String bankAccountNumber;
    private Float balance;
    private Integer transactionDay;
    private Float minimumAmount;
    private String clientId;


}
