package com.zipcodewilmington.preassessment2;

public enum PersonEnum {
    ALICE("Alice"),
    BOB("Bob");

    private String name;

    PersonEnum(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return "Hey, my name is " + name.toUpperCase() + "!";
    }

    public boolean isAlice() {
        boolean answer = false;

        if (name.equalsIgnoreCase("Alice")) {
            answer = true;
        }

        //i want it to return true, if the input is alice

        return answer;

    }

    public boolean isBob() {
        boolean answer = false;


        if (name.equalsIgnoreCase("Bob")) {
            answer = true;
        }

        return answer;

    }


}
