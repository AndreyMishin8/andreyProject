package com.javastart.interfaces;

import com.sun.jdi.LongType;

public class Main {

    public static void main(String[] args) {

        Cat lori = new Cat();

        Dog bublic = new Dog();

        lori.say();
        bublic.say();

        findOwner(lori);
        findOwner(bublic);

        System.out.println("Lory " + ((Cat) lori).getOwner() + " Bublic " + ((Dog) bublic).getOwner());
    }

    private static void findOwner(Animal animal){

       if (animal.getClass() == Cat.class){

           animal.setOwner("Cat_Owner");
       }
       if (animal.getClass()== Dog.class){

         animal.setOwner("Dog_Owner");

        }


    }
}
