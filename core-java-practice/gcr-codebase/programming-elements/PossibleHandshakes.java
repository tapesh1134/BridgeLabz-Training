
import java.util.Scanner;

public class PossibleHandshakes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int students = sc.nextInt();
        System.out.printf("Number of possible handshakes %d", (students * (students + 1) / 2));
        sc.close();
    }
}
