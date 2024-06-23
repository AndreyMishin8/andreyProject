package com.javastart.masshomework;
import java.util.Scanner;
import java.util.Random;
public class Mass {

    public static void main(String[] args) {

        Scanner inputStart = new Scanner (System.in);

        System.out.println("Введите размер массива ");

        int massLenght = inputStart.nextInt();

        int[] mass = new int[massLenght];

        Random random = new Random();

        for (int i = 0; i < mass.length ; i++ ){

            mass[i] = random.nextInt(30);
            System.out.println("Сколько этих чисел в массиве ");
            int number = inputStart.nextInt();

            for (int element : mass){

                if (element == number) {

                    System.out.println(element);
                }
                int max = mass[0];
                for (int elements : mass){

                    if (element<max){
                        max=elements;
                    }
                }
                System.out.println("Максимальное значение " + max);
            }

        }



    }
}
