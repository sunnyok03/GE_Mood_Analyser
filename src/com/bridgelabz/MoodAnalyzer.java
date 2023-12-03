package com.bridgelabz;

public class MoodAnalyzer {

    public String analyzeMood(String message){
        message = message.toLowerCase();
        if(message.contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
