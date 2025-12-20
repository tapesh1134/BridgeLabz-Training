import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int[] multiplicationResult = new int[4];
		for (int i = 6; i <= 9; i++) {
			multiplicationResult[i - 6] = number * i;
			System.out.printf("%d * %d = %d%n", number, i, multiplicationResult[i - 6]);
		}
		scanner.close();
	}
}
