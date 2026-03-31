import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input < 0) {
			System.out.print("Number is not natural");
		} else {
			for (int i = 1; i <= input; i++) {
				System.out.printf("%d is %s\n", i, i % 2 == 0 ? "Even" : "Odd");
			}
		}
		scanner.close();
	}
}
