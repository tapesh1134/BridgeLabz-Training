package org.junitpractice;

class InvalidAmountException extends Exception {
	public InvalidAmountException(String message) {
		super(message);
	}
}

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double deposit(double amount) throws InvalidAmountException {
		if (amount < 0.0) {
			throw new InvalidAmountException("Deposit amount cannot be negative");
		}
		balance += amount;
		return balance;
	}

	public double withdraw(double amount) throws InvalidAmountException {
		if (amount < 0.0) {
			throw new InvalidAmountException("Withdrawal amount cannot be negative");
		}
		if (balance < amount) {
			throw new InvalidAmountException("Insufficient funds");
		}
		balance -= amount;
		return balance;
	}
}
