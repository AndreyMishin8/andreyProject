package service;

import entity.Account;
import entity.Bill;

public class Depositservice {

    public void deposit(Account account , int amount){

        Bill bill = account.getBill();

        int currentBillAmount = bill.getAmount();

        System.out.println("Пополнение счета " + " " + currentBillAmount);

        bill.setAmount(currentBillAmount + amount);

        System.out.println("Пополнение смчета прошло успешно "  + "  " + bill.getAmount());



    }





}
