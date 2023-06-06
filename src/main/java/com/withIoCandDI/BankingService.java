package com.withIoCandDI;

public interface BankingService {
    void transferMoney(Customer fromCustomer, Customer toCustomer, double amount);
}
