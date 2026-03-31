class BankAccount {
	long accountNumber;
	double balance;

	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}

class SavingsAccount extends BankAccount {
	double interestRate;

	public SavingsAccount(long accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	public void displayAccountType() {
		System.out.println("Savings Account");
	}
}

class CheckingAccount extends BankAccount {
	double withdrawalLimit;

	public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}

	public void displayAccountType() {
		System.out.println("Checking Account");
	}
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    public FixedDepositAccount(long accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
public class Accounts {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, 50000, 4.5);
        CheckingAccount checking = new CheckingAccount(1002, 30000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount(1003, 100000, 24);
        savings.displayAccountType();
        checking.displayAccountType();
        fd.displayAccountType();
    }
}

