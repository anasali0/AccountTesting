package com.anasbanat;

import java.util.ArrayList;
import java.util.List;

/**
 * Student Name: Anas Ali Deeb Banat
 * Student ID: 20172121
 * Software Testing
 * */

public class Account {

    public double initialBalance;
    double currentBalance;
    public List<Double> deposits;
    public List<Double> withdrawals;
    public String currency;
    public String owner;

    public Account() {
        initialBalance = 0;
        currentBalance = 0;
        deposits = new ArrayList<>();
        withdrawals = new ArrayList<>();
        currency = "$";
        owner = "Anas Ali Banat";
    }

    public double getBalance() {
        return currentBalance;
    }

    public void makeDeposit(double amount) {
        currentBalance += amount;
        deposits.add(amount);
    }

    public void makeWithdrawal(double amount) {
        if (amount >= currentBalance) {
            throw new IllegalArgumentException("Not enough balance in the account...");
        }
        currentBalance -= amount;
        withdrawals.add(amount);
    }

    public void empty() {
        initialBalance = 0;
        currentBalance = 0;
        deposits = new ArrayList<>();
        withdrawals = new ArrayList<>();
        currency = null;
        owner = null;
    }

    /**
     * Student Name: Anas Ali Deeb Banat
     * Student ID: 20172121
     * Software Testing
     * */

}