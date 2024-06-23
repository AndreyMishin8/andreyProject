package com.homework.banksystem;

import service.Depositservice;
import entity.Person;
import entity.Bill;
import entity.Account;
import service.PaymentService;
import service.TrancferService;

/**
 * Учеба это важно!
 *
 */

public class Main {

    public static void main(String[] args) {

        Person loriPerson = new Person("Lori" , "Jane" , "4556464446");

        Bill loriBill = new Bill(10000);

        Account loriAccount = new Account(loriPerson,loriBill);

        Person andreyPerson = new Person ("Андрей", "Мишин", "4478717746");

        Bill andreyBill = new Bill (7777777);

        Account andreyAccount = new Account(andreyPerson, andreyBill);

        PaymentService paymentService = new PaymentService();

        paymentService.pay(loriAccount, 1000);
        paymentService.pay(andreyAccount, 1000);

        Depositservice depo1 = new Depositservice();
        Depositservice depo2 = new Depositservice();

        depo1.deposit(loriAccount, 700070);
        depo2.deposit(loriAccount, 10000000);

        TrancferService trancferService = new TrancferService();

        trancferService.trancfer(loriAccount, andreyAccount, 507777777);






    }
}
