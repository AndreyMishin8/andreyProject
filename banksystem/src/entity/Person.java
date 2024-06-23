package entity;

public class Person {

    private String name;

    private String surName;


     private String phoneNumber;


    public Person(String name, String surName, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.surName = surName;

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


