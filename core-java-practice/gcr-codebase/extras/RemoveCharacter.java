import java.util.Scanner;

public class RemoveCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Enter character:");
		char character = scanner.next().charAt(0);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != character) {
				sb.append(input.charAt(i));
			}
		}
		System.out.printf("Final string: %s", sb.toString());
		scanner.close();
	}
}