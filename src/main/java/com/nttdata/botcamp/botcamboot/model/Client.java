package com.nttdata.botcamp.botcamboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collation = "Client")
public class Client {
    @Id
    private String id;
    private String typeDoc;
    private String numberDOc;
    private String fullName;
    private Integer typeClient;  //0 Personal; 1 Empresarial
    private String numberAccount;
    private String direction;
    private String typeprofile; // "V" Vip; "P" PYME
}
