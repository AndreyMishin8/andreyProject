package service;

import entity.Account;

public class TrancferService {

    public void trancfer (Account accountFrom , Account accountTo , int amount ){

        int billFromAmount = accountFrom.getBill().getAmount();

        int billToAmount = accountTo.getBill().getAmount();

        if (billFromAmount < amount) {

            System.out.println("\n");

            System.out.println("Перевод не возможен ! " );

        } else {

            System.out.println( "\n ");
            System.out.println("Происходит перевод средств с аккаунта " + accountFrom.getAccountHolder().getName() + " на аккаунт - " + accountTo.getAccountHolder().getName());
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод успешно завершен! ");




        }


        }




    }



