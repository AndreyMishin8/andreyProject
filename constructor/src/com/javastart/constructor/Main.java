package com.javastart.constructor;



public class Main {
    public static void main(String[] args) {

        Cat lory = new Cat("Lory");

        CatSay catSay = new CatSay();

        catSay.say(lory, "I want to eat!");

        Cat bax = new Cat("Bax");

        catSay.say(bax, "I want to sleep!");

        Cat martin = new Cat("Martin");

        catSay.say(martin, "I want to go!");

        CatSay.sayMeow();

        System.out.println(CatSay.hellow);
    }

}
