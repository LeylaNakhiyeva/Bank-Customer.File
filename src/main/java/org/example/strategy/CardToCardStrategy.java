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
                       card.setAmount(sc.nextDouble());
                        card.setBalance(card.getBalance() - card.getAmount());
                        card.setTransactionNo(100000000000L + (long) (Math.random() * 900000000000L));
                        customer.getCards().stream().filter(card1 -> card1.getCardNumber().equals(cardNumberTo))
                                .forEach(card1 -> {
                                    card1.setBalance(card1.getBalance() + card.getAmount());
                                }); card.setAmount(0);
                    });

        });


    }
}
