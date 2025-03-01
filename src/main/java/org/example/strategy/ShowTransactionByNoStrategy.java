package org.example.strategy;

import org.example.model.Bank;
import org.example.model.Customer;

import java.util.Scanner;

public class ShowTransactionByNoStrategy implements MenuStrategy{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the transaction number : ");
        long transactionNo = sc.nextLong();
        Bank.customers.forEach(customer -> {
            customer.getCards().stream().filter(card -> card.getTransactionNo().equals(transactionNo))
                    .forEach(card -> {
                        System.out.println(card.getCardNumber());
                    });
            });
        }
    }

