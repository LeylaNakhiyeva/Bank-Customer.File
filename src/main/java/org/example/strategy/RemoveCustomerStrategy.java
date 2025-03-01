package org.example.strategy;

import lombok.NoArgsConstructor;
import org.example.model.Bank;

import java.util.Scanner;
@NoArgsConstructor
public class RemoveCustomerStrategy implements MenuStrategy {
    @Override
    public void execute(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customerNo to remove: ");
        Integer customerNo= sc.nextInt();
        Bank.customers.removeIf(customer -> customerNo.equals(customer.getCustomerNo()));
        System.out.println("Successful deletion");
    }
}
