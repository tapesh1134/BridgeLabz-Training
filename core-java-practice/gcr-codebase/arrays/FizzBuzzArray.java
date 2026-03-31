import java.util.Scanner;

public class FizzBuzzArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		if (number > 0) {
			String[] results = new String[number + 1];
			for (int i = 0; i <= number; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					results[i] = "FizzBuzz";
				} else if (i % 3 == 0) {
					results[i] = "Fizz";
				} else if (i % 5 == 0) {
					results[i] = "Buzz";
				} else {
					results[i] = String.valueOf(i);
				}
			}
			System.out.println("FizzBuzz Result:");
			for (int i = 1; i <= number; i++) {
				System.out.println("Position " + i + " = " + results[i]);
			}
		} else {
			System.err.println("Enter a positive integer.");
		}

		scanner.close();
	}
}
