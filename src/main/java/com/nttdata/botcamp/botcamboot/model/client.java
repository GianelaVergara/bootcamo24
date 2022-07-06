package com.nttdata.botcamp.botcamboot.model;
import lombok.Data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "client")
public class client {
@Id
    private ObjectId id;
    private String typeDoc;
    private String fullName;
    private String TypeClient;
    private String numberAccount;
    private String direction;
    private String numberDoc;

}
