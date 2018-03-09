package com.zipcodewilmington.preassessment2;

public class PersonProperty<T> {
    private T value;

    public PersonProperty(T someValue) {
        this.value = someValue;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T newVal){
        this.value = newVal;
    }

    public void printValue() {
        System.out.println(this.value);
    }
}
