package com.withIoCandDI;

public class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;
    
    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    
    public double getBalance() {
        return balance;
    }
}
