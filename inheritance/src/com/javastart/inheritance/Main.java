package com.javastart.inheritance;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        British lori = new British( 7, "Ally" , "Lorry");

       Scottish baxter = new Scottish(4, "Andre" , "Baxter");

        lori.sayMay();
        baxter.sayMay();


        System.out.println("Имя первого кота " + lori.getName() + " "+ "Возраст =" + " " + lori.getAge() +", " + "Имя владельца" + " " +  lori.getOwner());
        System.out.println("Имя второго кота " + baxter.gateName() + " " +   "Возраст = " + " " + baxter.getAge() + ", "+ "Имя владельца" + " "+baxter.getOwner());

        System.out.println(lori.toString());
        System.out.println(baxter.toString());

    British martin = new British(4, "Alex" , "Martin");
    British anothermarty = new British(4, "Alex" , "Martin");

        System.out.println(martin == anothermarty);
        System.out.println(martin.equals(anothermarty));

    }
    }

