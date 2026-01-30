package org.junitpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UnitTest {
	@Test
	public void Test_Deposit_ValidAmount() throws InvalidAmountException {
		BankAccount bankAccount = new BankAccount(1000.0);
		double balance = bankAccount.deposit(200.0);
		assertEquals(balance, 1200.0);
	}

	@Test
	public void Test_Deposit_NegativeAmount() {
		BankAccount bankAccount = new BankAccount(1000.0);
		InvalidAmountException exception = assertThrows(InvalidAmountException.class,
				() -> bankAccount.deposit(-100.0));
		assertEquals(exception.getMessage(), "Deposit amount cannot be negative");
	}

	@Test
	public void Test_Withdraw_ValidAmount() throws InvalidAmountException {
		BankAccount bankAccount = new BankAccount(1000.0);
		double balance = bankAccount.withdraw(100.0);
		assertEquals(balance, 900.0);
	}

	@Test
	public void Test_Withdraw_InsufficientFunds() {
		BankAccount bankAccount = new BankAccount(1000.0);
		InvalidAmountException exception = assertThrows(InvalidAmountException.class,
				() -> bankAccount.withdraw(2000.0));
		assertEquals(exception.getMessage(), "Insufficient funds");
	}
}
