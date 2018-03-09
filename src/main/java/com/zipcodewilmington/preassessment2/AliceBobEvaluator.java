package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String input;


    public AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice(){

        boolean answer = false;
        //i only want to return true if it is alice
        if (input.equalsIgnoreCase("Alice")){
            answer = true;
        }

        return answer;
    }

    public boolean isBob(){
        boolean answer = false;
        if (input.equalsIgnoreCase("bob")){
            answer = true;
        }

        return answer;
    }



}
