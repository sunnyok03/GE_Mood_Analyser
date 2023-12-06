package com.bridgelabz;

public class Main {
    public static void main(String[] args){
        try{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        System.out.println(moodAnalyzer.analyzeMood());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}