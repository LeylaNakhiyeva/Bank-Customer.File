package org.example.strategy;

import org.example.model.Bank;

import java.util.Scanner;

public class UpdateCustomerStrategy implements MenuStrategy{
    @Override
    public void execute(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the customerNo to update: ");
        Integer customerNo= sc.nextInt();

        Bank.customers.stream()
                .filter(customer -> customerNo.equals(customer.getCustomerNo()))
                .forEach(customer -> {
                    System.out.print("Enter the new name: ");
                    String newName = sc.next();
                    System.out.print("Enter the new surname: ");
                    String newSurname = sc.next();
                    customer.setName(newName);
                    customer.setSurname(newSurname);
                });

    }
}
