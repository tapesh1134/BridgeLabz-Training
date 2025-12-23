import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = scanner.next();
		StringBuilder sb = new StringBuilder();
		String reversedString = sb.append(string).reverse().toString();
		System.out.printf("Original string %s and reversed string %s", string, reversedString);
		scanner.close();
	}
}
