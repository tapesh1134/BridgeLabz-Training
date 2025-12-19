import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input > 0) {
			System.out.printf("The sum of %d natural numbers is %d", input, input * (input + 1) / 2);
		} else {
			System.out.printf("The number %d is not a natural number", input);
		}
		scanner.close();
	}

}
