package org.example;

public class BankAccount {
    private String accountId;

    private double balance;

    static int totalAccounts;

    public BankAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
        totalAccounts++;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
