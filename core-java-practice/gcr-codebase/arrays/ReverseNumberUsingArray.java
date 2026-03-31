import java.util.Scanner;

public class ReverseNumberUsingArray {
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
		System.out.print("Reversed number: ");
		for (int i = 0; i < count; i++) {
			System.out.print(digits[i]);
		}
		scanner.close();
	}
}
