package org.example;

import org.example.enums.MenuEnum;
import org.example.util.BankUtil;
import org.example.util.MenuUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankUtil.initializeCustomerData();
        Scanner sc = new Scanner(System.in);
        while (true) {
            MenuUtil.showMenuItems();
            System.out.print("Seçin: ");
            int option = sc.nextInt();
            MenuEnum menu = MenuEnum.getEnumByValue(option);

            menu.getStrategy().execute();
        }
    }
}