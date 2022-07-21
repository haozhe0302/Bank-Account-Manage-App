package com.bankaccountapp;

public abstract class Account implements IBaseRate{
    // List common properties for savings and checking accounts
    private String name;
    private String sIN;
    private double balance;

    protected String accountNumber;
    protected double rate;

    private static int index = 10000;
    private static double bonus = 100; // $ 100 bonus for every new customer

    // Constructor to set base properties and initialize the account
    public Account(String name, String sIN, double initDeposit){
        this.name = name;
        this.sIN = sIN;
        balance = initDeposit + bonus;
        // System.out.println("NAME: " + name + " SIN: " + sIN + " BALANCE: $" + balance);

        index ++;
        this.accountNumber = setAccountNumber();

        setRate();
        // System.out.println("************");
    }

    public abstract void setRate();

    // Set random account number
    private String setAccountNumber(){
        String lastTwoSIN = sIN.substring(sIN.length()-2, sIN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoSIN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * rate / 100;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    // List common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("DEPOSITING $" + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("WITHDRAWING $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("TRANSFERING $" + amount + " TO " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("YOUR CURRENT BALANCE: $" + balance);
    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nINTEREST RATE: " + rate + "%"
        );
    }
}
