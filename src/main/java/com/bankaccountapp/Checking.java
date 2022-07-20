package com.bankaccountapp;

public class Checking extends Account{
    // List properties specific to a Checking account

    // Constructor to initialize checking account properties
    public Checking(String name){
        super(name);    // Account is the parent class that super refers to
        System.out.println("New Checking Account");
    }
    // List any methods specific to the checking account
}
