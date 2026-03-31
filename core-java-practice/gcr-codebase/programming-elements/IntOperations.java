
import java.util.Scanner;

public class IntOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.printf("Operations:\n" + "a + b * c = %d\n" + "a * b + c = %d\n" + "c + a / b = %d\n" + "a %% b + c = %d\n", (num1 + num2 * num3), (num1 * num2 + num3), (num3 + num2 / num1), (num1 % num2 * num3));
        sc.close();
    }
}
