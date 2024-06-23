package com.javastart.booleanlogic;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner inputFromLine = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        String inputFirstNumber = "Введите первое число";
        String inputSecondNumber = "Введите второе число";
        String firstIsBigger = "Первое число больше второго";
        String secondIsBigger= "Второе число больше первого";
        String numbersAreIquals = "Числа равны";

        System.out.println(inputFirstNumber);

        firstNumber = inputFromLine.nextInt();

        System.out.println(inputSecondNumber);

        secondNumber = inputFromLine.nextInt();

       if (firstNumber>secondNumber) {

           System.out.println(firstIsBigger);

       } else if (secondNumber > firstNumber){

               System.out.println(secondIsBigger);

           }
           else {

               System.out.println(numbersAreIquals);
           }
       }

       int a = 10;
       byte b = (byte)a;
       short c = (short)a;
       long d = a;


}





