package com.woo.chatapp;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Data
@Document(collection = "chat")
public class Chat {

    @Id
    private String id;  //MongoDB는 String으로 잡아줘야 한다.
    private String msg;
    private String sender; //보내는 사람
    private String receiver; //받는 사람

    private LocalDateTime createdAt;
}

