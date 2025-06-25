package com.example.Bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class BankTest {

private Bank acc;
	
	@BeforeEach

	void setup() {
		acc=new Bank();
	}
	
	@AfterEach
	
	void teardown() {
		acc=null;
	}
	@Test
	void testdeposit() {
		double amt =100.00;
		
		acc.deposit(amt);
		
		assertEquals(100.00,acc.showbalance());
	}
	
	@Test
	void testwithdraw() {
		
		acc.deposit(200.00);
		acc.withdraw(50.00);
		assertEquals(150.00, acc.showbalance());
	}
	

}
