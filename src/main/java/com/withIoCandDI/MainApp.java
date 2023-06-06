package com.withIoCandDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// Create the Spring application context
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve the banking service bean from the context
		BankingService bankingService = context.getBean(BankingService.class);

		// Create customers
		Customer customer1 = new Customer("John Doe", "123 Main St");
		Customer customer2 = new Customer("Jane Smith", "456 Elm St");

		// Perform money transfer
		bankingService.transferMoney(customer1, customer2, 100.0);
	}
}
