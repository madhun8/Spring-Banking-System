package com.withIoCandDI;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
