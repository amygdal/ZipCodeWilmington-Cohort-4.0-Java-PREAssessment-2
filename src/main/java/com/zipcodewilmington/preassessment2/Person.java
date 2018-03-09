package com.zipcodewilmington.preassessment2;

import java.util.Date;

public class Person {
    private PersonProperty<String> nameProperty;
    private PersonProperty<Integer> ageProperty;
    private PersonProperty<Date> birthDateProperty;

    public Person(String name, int age, Date birthDate) {
        this.nameProperty = new PersonProperty<String>(name);
        this.ageProperty = new PersonProperty<Integer>(age);
        this.birthDateProperty = new PersonProperty<Date>(birthDate);
    }

    public String getNameProperty() {
        return nameProperty.getValue();
    }

    public void setNameProperty(String nameProperty) {
        String s = this.getNameProperty();
        System.out.println(s);
        this.nameProperty.setValue(nameProperty);
    }

    public int getAgeProperty() {
        return ageProperty;
    }

    public void setAgeProperty(int ageProperty) {
        this.ageProperty = ageProperty;
    }

    public void printAge() {
        System.out.println(this.ageProperty);
    }

    public void printName() {
        System.out.println(this.nameProperty);
    }

    public Date getBirthDateProperty() {
        return birthDateProperty;
    }

    public void setBirthDateProperty(Date birthDateProperty) {
        this.birthDateProperty = birthDateProperty;
    }

    public void printBirthDate() {
        System.out.println(birthDateProperty);
    }
}
