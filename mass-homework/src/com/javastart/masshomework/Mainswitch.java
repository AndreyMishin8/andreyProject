package com.javastart.masshomework;
import java.util.Scanner;
public class Mainswitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");

        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число: ");

        int secondNumber = scanner.nextInt();

        System.out.println("Выберите операцию 1 - сложение, 2 вычетание , 3 деление , 4 деление с остатком");

        int operation =scanner.nextInt();

        switch (operation){

            case 1:

                System.out.println(firstNumber + secondNumber);

                break;

            case 2:

                System.out.println(firstNumber - secondNumber);

                break;

            case 3:

                System.out.println(firstNumber / secondNumber);

                break;

            case 4:

                System.out.println(fir stNumber % secondNumber);

                break;

        }




    }
}
