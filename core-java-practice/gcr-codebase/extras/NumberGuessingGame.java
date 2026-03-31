import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = 1;
		int max = 100;
		int output;
		String feedback;
		System.out.println("Think of a number between 1 and 100");

		while (true) {
			output = (min + max) / 2;
			System.out.println("My output is: " + output);
			System.out.print("Is the number high, low, or correct: ");
			feedback = scanner.next().toLowerCase();
			if (feedback.equals("correct")) {
				System.out.println("I guessed the number");
				break;
			} else if (feedback.equals("high")) {
				max = output - 1;
			} else if (feedback.equals("low")) {
				min = output + 1;
			} else {
				System.out.println("Invalid input");
			}
		}
		scanner.close();
	}
}
