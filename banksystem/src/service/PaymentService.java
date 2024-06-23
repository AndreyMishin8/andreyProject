package service;

import entity.Account;
import entity.Bill;


public class PaymentService {

    public void pay(Account account, int amount){

        Bill bill = account.getBill();

        if (bill.getAmount() < amount){

            System.out.println(" Платеж не возможен! Недостаточно средств");

        }


            else{

                int currentBillAccount = bill.getAmount();

            System.out.println("Происходит текущая операция платежа"+"  " + currentBillAccount);

                bill.setAmount(currentBillAccount - amount);
            System.out.println("Текущее значение счета " + "  " +  bill.getAmount());
        }

        }
    }





