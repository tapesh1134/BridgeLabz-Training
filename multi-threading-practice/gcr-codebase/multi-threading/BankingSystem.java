import java.time.LocalDateTime;
class BankAccount {
    private int balance = 10000;

    public int getBalance() {
        return balance;
    }
    public boolean withdraw(int amount) {
        if (balance >= amount) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            return true;
        }
        return false;
    }
}


class Transaction implements Runnable {

    private BankAccount account;
    private int amount;
    private String customerName;

    public Transaction(BankAccount account, int amount, String customerName) {
        this.account = account;
        this.amount = amount;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        System.out.println("[" + customerName + "] Attempting to withdraw " + amount);

        boolean success = account.withdraw(amount);
        LocalDateTime time = LocalDateTime.now();

        if (success) {
            System.out.println(
                "Transaction successful: " + customerName +
                ", Amount: " + amount +
                ", Balance: " + account.getBalance() +
                ", Time: " + time
            );
        } else {
            System.out.println(
                "Transaction failed: " + customerName +
                ", Amount: " + amount +
                ", Balance: " + account.getBalance() +
                ", Time: " + time
            );
        }
    }
}


public class BankingSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, 3000, "Customer-1"), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, 4000, "Customer-2"), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, 2000, "Customer-3"), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, 5000, "Customer-4"), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, 1500, "Customer-5"), "Customer-5");

        System.out.println(t1.getName() + " State: " + t1.getState());
        System.out.println(t2.getName() + " State: " + t2.getState());
        System.out.println(t3.getName() + " State: " + t3.getState());
        System.out.println(t4.getName() + " State: " + t4.getState());
        System.out.println(t5.getName() + " State: " + t5.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
