import java.util.Scanner;

class BankAccount {
	private String accountHolder;
	private String accountNumber;
	private double balance;

	public BankAccount(String accountHolder, String accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void displayBank() {
		System.out.println("\tSBI");

	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.printf("Deposited: %.2f%n", amount);
		} else {
			System.out.println("Invalid amount");
		}
	}

	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.printf("Withdraw amount : %.2f%n", amount);
		} else if (amount <= 0) {
			System.out.println("Invalid withdraw amount");
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void displayBalance() {
		System.out.printf("Current balance: %.2f%n", balance);
	}

}

public class ATM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter account holder name: ");
		String aName = scanner.next();
		System.out.print("Enter account number: ");
		String aNumber = scanner.next();
		System.out.print("Enter balance: ");
		double aBalance = scanner.nextDouble();
		BankAccount account = new BankAccount(aName, aNumber, aBalance);
		account.displayBank();
		account.displayBalance();
		account.deposit(200.00);
		account.displayBalance();
		account.withdraw(100.00);
		account.displayBalance();
		account.withdraw(900.00);
		scanner.close();
	}
}
