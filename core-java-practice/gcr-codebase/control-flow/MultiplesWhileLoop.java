import java.util.Scanner;

public class MultiplesWhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number less than 100: ");
		int number = scanner.nextInt();
		if (number > 0 && number < 100) {
			int counter = number - 1;
			while (counter > 0) {
				if (number % counter == 0) {
					System.out.printf("Number %d is multiple of %d%n", counter, number);
				}
				counter--;
			}
		} else {
			System.out.println("Invalid input! Please enter a positive number less than 100.");
		}
		scanner.close();
	}
}
