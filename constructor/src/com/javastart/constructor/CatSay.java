package com.javastart.constructor;

public class CatSay {

    public static String hellow = "Hellow from static!!!";

    public static void sayMeow(){

        System.out.println("MEOW!");

    }

    public void say(Cat cat , String massage){

        String catName = cat.getName();

        System.out.println(conCatNameMessage (catName, massage));

    }

    private String conCatNameMessage (String name , String massage){

        return name + ": " + massage;

    }

}
