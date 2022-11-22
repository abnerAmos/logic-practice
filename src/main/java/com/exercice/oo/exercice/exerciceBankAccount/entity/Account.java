package com.exercice.oo.exercice.exerciceBankAccount.entity;

public class Account {

    private static final double RATE = 5;

    private String name;

    private int account;

    private double balance;

    public Account(String name, int account, double initialDeposit) {
        this.name = name;
        this.account = account;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + RATE;
    }

    public String toString() {
        return "Nome: " + getName() +
                ", Conta: " + getAccount() +
                ", Saldo: " + getBalance();
    }
}
