import java.util.Scanner;

public class FizzBuzzWhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		if (input < 0) {
			System.out.print("Entered number is not positive");
		} else {
			int i = 1;
			while (i <= input) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
				i++;
			}
		}
		scanner.close();
	}
}
