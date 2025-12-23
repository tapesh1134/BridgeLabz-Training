
import java.util.Scanner;

public class PositiveNegativeZero {

    public static int check(int n) {
        if (n > 0) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int r = check(n);
        if (r == 1) {
            System.out.println("Positive");
        } else if (r == -1) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        scanner.close();
    }
}
