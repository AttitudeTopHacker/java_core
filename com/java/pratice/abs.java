package com.java.pratice;

abstract class Account {
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    abstract double getBalance();
}

class SavingsAccount extends Account {
    double balance = 0;

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }
}

public class abs extends SavingsAccount {
    public static void main(String[] args) {
        abs costumer = new abs();
        costumer.deposit(2434);
        System.out.println(costumer.getBalance());
        costumer.withdraw(2223);
        System.out.println(costumer.getBalance());
    }
}
