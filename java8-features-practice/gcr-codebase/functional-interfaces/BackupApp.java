
interface BackupSerializable {

}

class UserData implements BackupSerializable {

    private String username;
    private String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }
}

class TransactionData implements BackupSerializable {

    private int transactionId;
    private double amount;

    public TransactionData(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
}

public class BackupApp {

    public static void backupObject(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Object not eligible for backup.");
        }
    }

    public static void main(String[] args) {
        UserData user = new UserData("Tapesh", "tapesh@email.com");
        TransactionData transaction = new TransactionData(101, 5000);

        backupObject(user);
        backupObject(transaction);
    }
}
