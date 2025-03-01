package org.example;

import org.example.enums.MenuEnum;
import org.example.util.BankUtil;
import org.example.util.MenuUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        BankUtil.initializeCustomerData();
        Scanner sc = new Scanner(System.in);
        while (true) {
            MenuUtil.showMenuItems();
            System.out.print("Seçin: ");
            int option = sc.nextInt();
            System.out.println();
            MenuEnum menu = MenuEnum.getEnumByValue(option);

            menu.getStrategy().execute();
            System.out.println();
        }
    }
}