
import java.util.*;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int number1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int number2 = sc.nextInt();

            int result = number1 / number2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            System.out.println("Please enter only numeric values");

        } finally {
            sc.close();
        }
    }
}
