package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am happy.");
        System.out.println(moodAnalyzer.analyzeMood());
    }
}