package com.bankaccountapp;

public class Checking extends Account{
    // List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String sIN, double initDeposit){
        super(name, sIN, initDeposit);    // Account is the parent class that super refers to
        accountNumber = "1" + accountNumber;  // 1 refers to checking account
        // System.out.println("NEW CHECKING ACCOUNT: ACCOUNT NUM: " + accountNumber);
        setDebitCard();
    }

    @Override
    public void setRate(){
        // System.out.println("IMPLEMENT RATE FOR CHECKING");
        rate = getBaseRate() * 0.15;
    }


    // List any methods specific to the checking account

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        System.out.println("ACCOUNT TYPE: CHECKING");
        super.showInfo();
        System.out.println(
                "CHECKING ACCOUNT FEATURES: " +
                "\nDEBIT CARD NUMBER: " + this.debitCardNumber +
                "\nDEBIT CARD PIN: " + this.debitCardPIN
        );
        System.out.println("************");
    }
}
