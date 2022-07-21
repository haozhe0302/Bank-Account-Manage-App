package com.bankaccountapp;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args){
        List<Account> accounts = new LinkedList<Account>();

        String basePath = new File("").getAbsolutePath();
        String filePath = basePath + "\\BankAccountsInfo.csv";

        // Test code for building architecture
//        Checking chkacc1 = new Checking("Tom Wilson", "114514", 2000);
//        Savings savacc1 = new Savings("Rich Lowe", "31415926", 1000);
//
//        chkacc1.showInfo();
//        savacc1.showInfo();

//        savacc1.deposit(5000);
//        savacc1.withdraw(200);
//        savacc1.transfer("Brokerage", 3000);

//        savacc1.compound();

        // Read csv file to acquire customers information data
        List<String[]> accountHolder = utility.CSV.read(filePath);
        for (String[] eachHolder : accountHolder){
            String name = eachHolder[0];
            String sIN = eachHolder[1];
            String accountType = eachHolder[2];
            double initDeposit = Double.parseDouble(eachHolder[3]);

            if (accountType.equals("Savings")){
                accounts.add(new Savings(name, sIN, initDeposit));
            }
            else if (accountType.equals("Checking")){
                accounts.add(new Checking(name, sIN, initDeposit));
            }
            else {
                System.out.println("ERROR ACCOUNT TYPE");
            }

            // System.out.println(name + " " + sIN + " " + accountType + " $" + initDeposit);
        }

        // Display each account details
        for (Account acc : accounts){
            acc.showInfo();
        }
    }
}
