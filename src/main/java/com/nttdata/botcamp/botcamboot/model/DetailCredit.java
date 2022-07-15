package com.nttdata.botcamp.botcamboot.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "Detalle")
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailCredit {

    @Id
    private String id;
    private String typeDoc;
    private String numberAccount;
    private String fullName;
    private Double amountAvailable;
    private String typeAccount;
    private String descriptionAccount;
    private String producto;
    private String nameRepLegal; //Nombre del Representante Legal
    private String numberDoc_RepLegal;
    private String movement;
    private String state;
    private Date date;


}
