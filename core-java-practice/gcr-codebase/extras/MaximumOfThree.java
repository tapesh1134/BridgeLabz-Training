import java.util.Scanner;

public class MaximumOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number:");
		int num2 = scanner.nextInt();
		System.out.print("Enter third number:");
		int num3 = scanner.nextInt();
		int result = Math.max(num1, Math.max(num2, num3));
		System.out.printf("Maximum between three number is %d", result);
		scanner.close();
	}
}
