package org.example.strategy;

import org.example.model.Bank;

import java.util.Scanner;

public class ShowAllCustomerTransactionStrategy implements MenuStrategy{
    @Override
    public void execute() {

        Bank.customers
                .forEach(customer -> customer.getCards().forEach(card -> System.out.println(card.getTransactionNo())));
    }
}
