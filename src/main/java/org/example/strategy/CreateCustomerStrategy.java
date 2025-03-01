package org.example.strategy;

import org.example.model.Bank;
import org.example.model.Customer;

import java.util.Scanner;

public class CreateCustomerStrategy implements MenuStrategy{
    @Override
    public void execute(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Write the customerNo: ");
        Integer customerNo = sc.nextInt();
        System.out.print("Write the name: ");
        String name = sc.next();
        System.out.print("Write the surname: ");
        String surname = sc.next();

        Customer customer = new Customer(customerNo, name, surname);
        Bank.customers.add(customer);

      //  FileUtils.writeObjectToFile(FileConstants.CUSTOMER_FILE_NAME, Bank.customers);
    }
}
