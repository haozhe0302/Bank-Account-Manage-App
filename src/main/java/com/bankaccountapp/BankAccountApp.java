package com.bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args){

        Checking chkacc1 = new Checking("Tom Wilson", "114514", 2000);
        Savings savacc1 = new Savings("Rich Lowe", "31415926", 1000);

        chkacc1.showInfo();
        savacc1.showInfo();
    }
}
