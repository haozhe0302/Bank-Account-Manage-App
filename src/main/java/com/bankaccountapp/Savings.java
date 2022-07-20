package com.bankaccountapp;

public class Savings extends Account{
    // List properties specific to a Saving account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize Savings account properties settings
    public Savings(String name, String sIN, double initDeposit){
        super(name, sIN, initDeposit);    // Account is the parent class that super refers to
        accountNumber = "2" + accountNumber;    // 2 refers to savings account
        // System.out.println("NEW SAVINGS ACCOUNT: ACCOUNT NUM: " + accountNumber);
    }
    // List any methods specific to the savings account
    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: SAVINGS");
        System.out.println("************");
    }
}
