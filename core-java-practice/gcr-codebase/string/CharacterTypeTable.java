import java.util.Scanner;

public class CharacterTypeTable {
	public static String helper(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch + 32);
		}
		if (ch >= 'a' && ch <= 'z') {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return "Vowel";
			} else {
				return "Consonant";
			}
		}
		return "Not a Letter";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Character Type");

		for (int i = 0; i < input.length(); i++) {
			String result = helper(input.charAt(i));

			if (result.equals("Vowel")) {
				System.out.println(input.charAt(i) + "\t" + result);
			} else if (result.equals("Consonant")) {
				System.out.println(input.charAt(i) + "\t" + result);
			} else {
				System.out.println(input.charAt(i) + "\t" + result);
			}
		}

		scanner.close();
	}
}
