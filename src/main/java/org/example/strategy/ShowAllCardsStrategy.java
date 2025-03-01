package org.example.strategy;

import org.example.model.Bank;

import java.util.Scanner;

public class ShowAllCardsStrategy implements MenuStrategy{
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customerNo for show all cards: ");
        int customerNo = sc.nextInt();
        Bank.customers.stream()
                .filter(customer -> customer.getCustomerNo() == customerNo)
                .forEach(customer -> System.err.println("Cards : "+customer.getCards())
                )
        ;
    }
}