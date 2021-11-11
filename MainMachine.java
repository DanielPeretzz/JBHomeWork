package com.homework.daniel;

import java.util.Scanner;

public class MainMachine {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        VendingMachine JinTonicVemoabetMachine = new VendingMachine();
        System.out.println("Please enter your amount of money : ");
        double amount = SCANNER.nextDouble();
        JinTonicVemoabetMachine.buyDrink(amount);

    }
}
