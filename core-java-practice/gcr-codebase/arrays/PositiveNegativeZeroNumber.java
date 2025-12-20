import java.util.Scanner;

public class PositiveNegativeZeroNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Enter number %d: ", i + 1);
			numbers[i] = scanner.nextInt();
		}
		for (int i : numbers) {
			if (i < 0) {
				System.out.printf("%d number is Negative%n", i);
			} else if (i == 0) {
				System.out.println("Number is Zero");
			} else {
				if (i % 2 == 0) {
					System.out.println("Number is even");
				} else {
					System.out.println("Number is odd");
				}
			}
		}
		System.out.printf("On comparison first number %s second",
				numbers[0] < numbers[numbers.length - 1] ? "is greater than"
						: numbers[0] == numbers[numbers.length - 1] ? "is equal to" : "is lesser than");
		scanner.close();
	}
}
