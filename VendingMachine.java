package com.homework.daniel;

public class VendingMachine {
    public void buyDrink(double amountOfMoney){
        if(amountOfMoney<4.5){
            System.out.println("not enough");
        }
        else if(amountOfMoney > 10){
            System.out.println("too much money");
        }
        else {
            System.out.println("Thank you! please take your drink");
        }
    }

}

