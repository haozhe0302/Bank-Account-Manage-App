package com.bankaccountapp;

public abstract class Account implements IBaseRate{
    // List common properties for savings and checking accounts

    // Constructor to set base properties and initialize the account
    public Account(String name){
        System.out.print("New Account: ");
        System.out.println("Name: " + name);
    }
    // List common methods
}
