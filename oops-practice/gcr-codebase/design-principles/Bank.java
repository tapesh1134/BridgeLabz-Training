import java.util.ArrayList;

class Account {
	private int accountNumber;
	private double balance;
	private String bank;

	public Account(int accountNumber, String bank) {
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.balance = 0.0;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getBank() {
		return bank;
	}
}

class Customer {
	private String name;
	private ArrayList<Account> accounts;

	public Customer(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void viewBalance() {
		System.out.println("\nCustomer: " + name);
		for (Account acc : accounts) {
			System.out.println("Bank: " + acc.getBank() + ", Balance: " + acc.getBalance());
		}
	}

	public String getName() {
		return name;
	}

}

public class Bank {
	private String bankName;
	private ArrayList<Account> accounts;

	public Bank(String bankName) {
		this.bankName = bankName;
		this.accounts = new ArrayList<>();
	}

	public Account openAccount(Customer customer, int accountNumber) {
		Account account = new Account(accountNumber, bankName);
		accounts.add(account);
		customer.addAccount(account);
		System.out.println("Account opened for " + customer.getName() + " at " + bankName);
		return account;
	}

	public String getBankName() {
		return bankName;
	}

	public static void main(String[] args) {
		Bank bank1 = new Bank("State Bank of India");
		Bank bank2 = new Bank("HDFC Bank");
		Customer c1 = new Customer("Amit");
		Customer c2 = new Customer("Riya");
		Account a1 = bank1.openAccount(c1, 101);
		a1.deposit(5000);
		Account a2 = bank2.openAccount(c1, 102);
		a2.deposit(3000);
		Account a3 = bank1.openAccount(c2, 103);
		a3.deposit(8000);
		c1.viewBalance();
		c2.viewBalance();
	}
}
