public class BankAccount {
	static String bankName = "SBI";
	static int totalAccounts = 0;
	final String accountNumber;
	String accountHolderName;
	double balance;

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		totalAccounts++;
	}

	public static void getTotalAccounts() {
		System.out.println("Total number of accounts: " + totalAccounts);
	}

	public void displayAccountDetails() {
		if (this instanceof BankAccount) {
			System.out.println("Bank Name: " + bankName);
			System.out.println("Account Holder: " + accountHolderName);
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Balance: " + balance);
		} else {
			System.out.println("Invalid account instance");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Raj", "12423345", 1000);
		BankAccount account2 = new BankAccount("Rahul", "24672890", 500);
		System.out.println("Account 1 Details:");
		account1.displayAccountDetails();
		System.out.println("Account 2 Details:");
		account2.displayAccountDetails();
		BankAccount.getTotalAccounts();
		System.out.println("Performing transactions on Account 1:");
		account1.deposit(200);
		account1.withdraw(150);
		account1.displayAccountDetails();
		account2.displayAccountDetails();
		account2.deposit(100);
		account2.withdraw(800);
	}
}
