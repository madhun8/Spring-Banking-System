package com.withIoCandDI;

import org.springframework.stereotype.Component;

@Component
public class BankingServiceImpl implements BankingService {
	private Account account;

	// Dependency is injected through constructor
	public BankingServiceImpl(Account account) {
		this.account = account;
	}

	public void transferMoney(Customer fromCustomer, Customer toCustomer, double amount) {
		System.out.println("Transferring money with 89,567...");
		account.withdraw(amount);
		// Perform other operations
		account.deposit(amount);
		System.out.println("Money transferred successfully!");

	}
}
