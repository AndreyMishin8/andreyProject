package com.javastart.booleanlogic;

import java.util.Scanner;

public class MainMass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] mass = new int[5];

        for (int i = 0; i < 5; i++) {

            //тело медота

            mass[i] = input.nextInt();

        }

        printMass(mass);

        int dayNumber;
        printDayOfWeek(dayNumber = 7);

}       public static void printDayOfWeek (int dayNumber){

        switch (dayNumber){

            case 1:
                System.out.println("Понедельник ");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда ");
                break;
            case 4:
                System.out.println("Четверг ");
                break;
            case 5:
                System.out.println("Пятница ");
                break;
            case 6:
                System.out.println("Суббота ");
                break;
            case 7:
                System.out.println("Воскресенье ");
                break;

        }

        }

        public static void printMass(int[] mass){

            for (int elements : mass){

                System.out.println("Значение елемента в массиве: " + elements);


            }

            }
        }





