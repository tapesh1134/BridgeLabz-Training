import java.util.Scanner;

public class CalculatorSwitchCases {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double first = scanner.nextDouble();
		System.out.print("Enter second number: ");
		double second = scanner.nextDouble();
		System.out.print("Enter operator: ");
		String operator = scanner.next();
		switch (operator) {
		case "+": {
			System.out.println(first + second);
			break;
		}
		case "-": {
			System.out.println(first - second);
			break;
		}
		case "*": {
			System.out.println(first * second);
			break;
		}
		case "/": {
			System.out.println(first / second);
			break;
		}
		default:
			System.out.println("unexpected operator");
		}
		scanner.close();
	}
}
