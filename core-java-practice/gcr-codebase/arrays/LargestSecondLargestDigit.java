import java.util.Scanner;

public class LargestSecondLargestDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int[] digits = new int[10];
		int index = 0;
		while (number != 0) {
			if (index == digits.length) {
				break;
			}
			digits[index] = number % 10;
			number = number / 10;
			index++;
		}
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < index; i++) {
			if (digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
			} else if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}
		System.out.printf("Largest digit: %s", largest);
		System.out.printf("Second largest digit: %s", secondLargest);
		scanner.close();
	}
}
