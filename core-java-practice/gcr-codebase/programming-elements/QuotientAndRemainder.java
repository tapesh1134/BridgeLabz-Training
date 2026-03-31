
import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d", num1 / num2, num1 % num2, num1, num2);
        sc.close();
    }
}
