import java.util.Scanner;

public class DigitFrequency {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int count = String.valueOf(number).length();
		int[] digits = new int[count];
		for (int i = 0; i < count; i++) {
			digits[i] = number % 10;
			number = number / 10;
		}
		int[] frequency = new int[10];
		for (int i = 0; i < count; i++) {
			frequency[digits[i]]++;
		}
		System.out.println("Digit Frequency:");
		for (int i = 0; i < 10; i++) {
			if (frequency[i] > 0) {
				System.out.printf("Digit %d occurs %d time%n", i, frequency[i]);
			}
		}
		scanner.close();
	}
}
