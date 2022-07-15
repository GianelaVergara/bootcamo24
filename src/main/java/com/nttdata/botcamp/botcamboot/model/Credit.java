package com.nttdata.botcamp.botcamboot.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "Credit")
public class Credit {
    @Id
    private String id;
    private String creditType;
    private String status;
    private Float initialAmount;
    private Float currentAmount;
    private Float interest;
    private Integer paymentDay;
    private String creditAccountNumber;
    private String clientId;
    private String cardNumber;
}
