package org.example.strategy;

import org.example.model.Bank;

import java.util.Scanner;

public class CardToCardStrategy implements MenuStrategy {
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your card number: ");
        long yourCardNumber = sc.nextLong();
        System.out.println("Enter card number to :");
        long cardNumberTo = sc.nextLong();
        Bank.customers.forEach(customer -> {
            customer.getCards().stream().filter(card -> card.getCardNumber().equals(yourCardNumber))
                    .forEach(card -> {
                        System.out.println("Enter amount: ");
                        double amount = sc.nextDouble();
                        card.setBalance(card.getBalance() - amount);
                        customer.getCards().stream().filter(card1 -> card1.getCardNumber().equals(cardNumberTo))
                                .forEach(card1 -> {
                                    card1.setBalance(card1.getBalance() + amount);
                                });
                    });

        });


    }
}
