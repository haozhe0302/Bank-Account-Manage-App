package com.bankaccountapp;

public interface IBaseRate {
    // Write a method to return the base rate
    default double getBaseRate(){
        // TODO: Call central bank API to get the current base rate
        return 2.5;
    }
}
