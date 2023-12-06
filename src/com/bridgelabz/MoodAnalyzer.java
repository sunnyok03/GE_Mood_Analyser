package com.bridgelabz;
/*
Analyzes mood whether a message is happy or sad
 */
public class MoodAnalyzer {
    private String message;

    /*
    default constructor
     */
    public MoodAnalyzer(){}

    /*
    parameterised constructor
     */
    public MoodAnalyzer(String message){
        this.message = message;
    }

    /*
    @desc: analyzeMood with no parameter, uses message field
    @params:
    @return: String indicating "SAD" or "HAPPY" message
     */
    public String analyzeMood() throws MoodAnalysisException {
        try {
            message = message.toLowerCase(); // throws error if null or empty
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            throw new MoodAnalysisException("NULL or empty String is passed.");
        }
    }
}
