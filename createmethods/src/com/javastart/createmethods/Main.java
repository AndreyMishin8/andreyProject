package com.javastart.createmethods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first;
        int second;

        System.out.println("Введдите первое число: ");

        first = input.nextInt();

        System.out.println("Введите второе число: ");

        second = input.nextInt();

        System.out.println("Сумма равна: " + sum(first, second));

    }
    public static int sum(int firstNumber , int secondNumber){

        return firstNumber+secondNumber;
    }
}