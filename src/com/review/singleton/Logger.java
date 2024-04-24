package com.review.singleton;

public class Logger {
    private static Logger instance;
    public String value;

    private Logger(String value){
        this.value = value;
    }

    public static Logger getInstance(String value){
        if(instance == null){
            instance = new Logger(value);
        }
        return instance;
    }
}
