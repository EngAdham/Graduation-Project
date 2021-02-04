package com.example.graduationproject.models;

public class User {
    private String userName;
    private String userMessage;
    private String userImageUrl;
    private String messageTime;

    public User(String userName, String userMessage, String userImageUrl,String messageTime) {
        this.userName = userName;
        this.userMessage = userMessage;
        this.userImageUrl = userImageUrl;
        this.messageTime=messageTime;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public String getMessageTime() {
        return messageTime;
    }
}
