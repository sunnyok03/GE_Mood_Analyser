package com.bridgelabz;

public class MoodAnalysisException extends Exception{

    private String error;
    public MoodAnalysisException (String str){
        super(str); // this will print the error "str"
        this.error = str;
    }
    /*
    @desc: saving the error to check in junit
     */
    public String getError(){
        return error;
    }
}
