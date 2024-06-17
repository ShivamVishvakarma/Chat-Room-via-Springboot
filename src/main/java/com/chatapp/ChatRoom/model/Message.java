package com.chatapp.ChatRoom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

%/ No entity as there is Spring JPA dependency is not present/%
@Data    
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String name;

    private String Content;
}
