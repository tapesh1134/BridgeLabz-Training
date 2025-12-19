import java.util.Scanner;

public class NaturalNumberSumCompare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input < 0) {
			System.out.println("Number is not natural");
		} else {
			int usingFormula = input * (input + 1) / 2;
			int sum = 0;
			while (input > 0) {
				sum += input;
				input--;
			}
			System.out.printf("Sum after using formula %d and sum after loop %d answer is %s", usingFormula, sum,
					usingFormula == sum ? "Correct" : "Wrong");
			scanner.close();
		}
	}
}
