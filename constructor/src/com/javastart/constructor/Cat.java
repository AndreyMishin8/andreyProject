package com.javastart.constructor;

public class Cat {


    private String name;

    private int age;

    private String owner;

    public Cat(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }
    public void setName(String cat){

        this.name = cat;

    }

    public int getAge(){

        return age;

    }

    public void setAge(int age){

        this.age = age;
    }

    public String getOwner(){

    return owner;

    }

    public void set(String owner){

        this.owner = owner;
    }

}
