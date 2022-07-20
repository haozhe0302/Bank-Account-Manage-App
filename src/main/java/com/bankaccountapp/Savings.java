package com.bankaccountapp;

public class Savings extends Account{
    // List properties specific to a Saving account

    // Constructor to initialize Savings account properties settings
    public Savings(String name){
        super(name);    // Account is the parent class that super refers to
        System.out.println("New Savings Account");
    }
    // List any methods specific to the savings account
}
