package com.techprimers.springbootwebsocketexample.model;

import java.util.Date;

public class UserResponse {
    String content;

    public UserResponse() {
    }

    public String getContent() {
        return content;
    }

    public UserResponse(String content, Date date) {
        this.content = content + " " + date;
    }
}
