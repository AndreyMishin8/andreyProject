package com.javastart.inheritance;

public class Cat {

    private int age;

    private String owner;

    public Cat(int age, String owner){

        this.age = age;
        this.owner = owner;

    }


    public int getAge (){

        return age;

    }

    public String getOwner(){

        return  owner;
    }

    public void setAge(int age){

        this.age = age;

    }
    public void setOwner(String owner){

        this.owner = owner;

    }



    public void sayMay(){

        System.out.println("Мяу!");

    }
}
