//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

   int firstNumber =5;
   int secondNumber = 10;
   int sum;
   int subtraction;
   int multiplication;
   int division;
   int reminder;

   
   sum = firstNumber + secondNumber;
   subtraction = secondNumber - firstNumber ;
   multiplication = firstNumber * secondNumber;
   division = secondNumber / firstNumber ;
   reminder = firstNumber % secondNumber;


   System.out.println(" Сумма = " + sum);
   System.out.println(" Вычитание = " + subtraction);

   System.out.println(" Умножение = " + multiplication);
   System.out.println(" Деление = " + division);
   System.out.println(" Остаток от деление = " +  reminder);
    }
}