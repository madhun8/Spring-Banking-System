package com.withIoCandDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.bank")
public class AppConfig {

	@Bean
	public Account currentAccount() {
		return new CurrentAccount(1000.0); // Provide overdraft limit
	}

	@Bean
	public BankingService bankingService(Account account) {
		return new BankingServiceImpl(account); // Inject the account dependency
	}
}
