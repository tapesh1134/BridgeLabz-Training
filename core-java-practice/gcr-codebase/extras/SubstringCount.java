import java.util.Scanner;

public class SubstringCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.next();
		System.out.print("Enter substring: ");
		String sub = scanner.next();
		int count = 0;
		int index = 0;

		while ((index = input.indexOf(sub, index)) != -1) {
			count++;
			index = index + sub.length();
		}
		System.out.println("Substring occurs " + count + " times");
	}
}
