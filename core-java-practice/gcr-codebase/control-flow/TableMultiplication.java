import java.util.Scanner;

public class TableMultiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		for (int i = 6; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input * i);
		}
		scanner.close();
	}
}
