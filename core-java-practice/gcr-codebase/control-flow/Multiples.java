import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number less than 100: ");
		int number = scanner.nextInt();
		if (number > 0 && number < 100) {
			for (int i = 100; i > 0; i--) {
				if (number % i == 0) {
					System.out.printf("Number %d is multiple of %d%n", i, number);
				}
			}
		} else {
			System.out.println("Invalid input! Please enter a positive number less than 100.");
		}
		scanner.close();
	}
}
