package org.example.strategy;

import org.example.model.Bank;

public class ShowAllCustomerStrategy implements MenuStrategy{
    @Override
    public void execute(){
       Bank.customers.forEach(System.err::println);
    }
}
