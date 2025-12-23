import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		int first = 0;
		int second = 1;
		for (int i = 1; i <= input; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		scanner.close();
	}
}
