package com.bankaccountapp;

public abstract class Account implements IBaseRate{
    // List common properties for savings and checking accounts
    String name;
    String sIN;
    double balance;

    String accountNumber;
    double rate;

    static int index = 10000;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sIN, double initDeposit){
        this.name = name;
        this.sIN = sIN;
        balance = initDeposit;
        // System.out.println("NAME: " + name + " SIN: " + sIN + " BALANCE: $" + balance);

        index ++;
        this.accountNumber = setAccountNumber();
    }

    // Set account number
    private String setAccountNumber(){
        String lastTwoSIN = sIN.substring(sIN.length()-2, sIN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSIN + uniqueID + randomNumber;
    }

    // List common methods
    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance
        );
    }
}
