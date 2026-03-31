import java.util.Scanner;

public class FactorialOfInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input < 0) {
			System.out.print("Number is not natural");
		} else {
			int factorial = 1;
			while (input > 1) {
				factorial *= input;
				input--;
			}
			System.out.printf("Factorial of number %d is %d", input, factorial);
		}
		scanner.close();
	}
}
