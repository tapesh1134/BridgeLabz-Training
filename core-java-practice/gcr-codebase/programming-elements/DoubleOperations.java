
import java.util.Scanner;

public class DoubleOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        System.out.printf("Operations:\n" + "a + b * c = %.2f\n" + "a * b + c = %.2f\n" + "c + a / b = %.2f\n" + "a %% b + c = %.2f\n", (num1 + num2 * num3), (num1 * num2 + num3), (num3 + num2 / num1), (num1 % num2 * num3));
        sc.close();
    }
}
