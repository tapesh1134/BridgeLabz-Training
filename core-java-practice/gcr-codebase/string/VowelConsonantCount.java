import java.util.Scanner;

public class VowelConsonantCount {
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

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < input.length(); i++) {
			String result = helper(input.charAt(i));

			if (result.equals("Vowel")) {
				vowels++;
			} else if (result.equals("Consonant")) {
				consonants++;
			}
		}

		System.out.println("Number of Vowels: " + vowels);
		System.out.println("Number of Consonants: " + consonants);

		sc.close();
	}
}
