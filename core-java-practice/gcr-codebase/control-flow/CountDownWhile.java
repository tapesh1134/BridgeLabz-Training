import java.util.Scanner;

public class CountDownWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to start timer: ");
		int number = scanner.nextInt();
		while (number != 0) {
			System.out.println(number);
			number--;
		}
		System.out.print("Launch");
		scanner.close();
	}

}
