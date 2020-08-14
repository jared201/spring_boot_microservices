package com.hueburg.api.demo.my_api;

public class DemoService {
     
    private final long id;
    private final String content;
    public DemoService(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }    
    
}