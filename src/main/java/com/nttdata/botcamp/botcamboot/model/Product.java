package com.nttdata.botcamp.botcamboot.model;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "TipoCuenta")
public class Product {
    @Id
    private String id;
    private String description;
    private String product;
}
