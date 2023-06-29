package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(BankAccount.getTotalAccounts());
        BankAccount ac1 = new BankAccount("1", 544.02);
        BankAccount ac2 = new BankAccount("2", 1032);
        BankAccount ac3 = new BankAccount("3", 0);
        System.out.println(BankAccount.getTotalAccounts());
        System.out.println(ac1.getBalance());
    }
}