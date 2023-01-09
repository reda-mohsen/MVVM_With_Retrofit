package com.example.demoretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    public int getUserId() {
        return userId;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
}


