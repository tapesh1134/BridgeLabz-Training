import java.util.Scanner;

public class CountDownFor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to start timer: ");
		int number = scanner.nextInt();
		for (; number > 0; number--) {
			System.out.println(number);
		}
		System.out.print("Launch");
		scanner.close();
	}

}
