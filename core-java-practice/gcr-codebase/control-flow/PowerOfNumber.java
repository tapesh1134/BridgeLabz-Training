import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		System.out.print("Enter power for number: ");
		int power = scanner.nextInt();
		if (number < 0 && power < 0) {
			System.out.println("Input is negative");
		} else {
			int result = 1;
			for (int i = 1; i <= power; i++) {
				result *= number;
			}
			System.out.printf("Result for base %d and power %d is %d", number, power, result);
		}
		scanner.close();
	}
}
