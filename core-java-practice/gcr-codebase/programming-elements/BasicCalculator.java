
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d, and %.2f", num1, num2, num1 + num2, num1 - num2, num1 * num2, (double) num1 / num2);
        sc.close();
    }
}
