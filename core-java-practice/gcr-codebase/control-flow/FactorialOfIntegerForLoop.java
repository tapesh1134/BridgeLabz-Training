import java.util.Scanner;

public class FactorialOfIntegerForLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input < 0) {
			System.out.print("Number is not natural");
		} else {
			int factorial = 1;
			System.out.printf("Factorial of number %d is ", input);
			for (; input > 0; input--) {
				factorial *= input;
			}
			System.out.print(factorial);
		}
		scanner.close();
	}
}
