import java.util.Scanner;

public class FactorsWhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input < 0) {
			System.out.print("Number is negative");
		} else {
			int i = 1;
			while (i < input) {
				if (input % i == 0) {
					System.out.printf("Number %d is divisible by %d%n", input, i);
				}
				i++;
			}
		}
		scanner.close();
	}
}
