package com.javastart.inheritance;

public class Scottish extends Cat{

    private String name;

    public Scottish(int age , String owner, String name){
        super(age , owner);
        this.name = name;
        this.name = name;
    }

    public String gateName(){

        return name;


    }

    public void setName(String name){

        this.name = name;
    }


    @Override
    public String toString() {
        return " Cat name = " + name + " cat age = " + getAge() + " Cat owner = " + getOwner();
    }
}
