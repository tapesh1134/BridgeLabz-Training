import java.util.Scanner;

public class TableOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int[] table = new int[10];
		for (int i = 0; i < table.length; i++) {
			table[i] = number * (i + 1);
			System.out.printf("%d * %d = %d%n", number, i + 1, table[i]);
		}
		scanner.close();
	}
}
