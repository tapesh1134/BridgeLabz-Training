import java.util.Scanner;

public class SentenceFormatter {
	public static String formatString(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toUpperCase(str.charAt(0)));
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && i + 1 < str.length() && !Character.isLetterOrDigit(str.charAt(i + 1))) {
				continue;
			} else if (str.charAt(i) == ',' && i + 1 < str.length() - 1 && str.charAt(i + 1) != ' ') {
				sb.append(str.charAt(i));
				sb.append(' ');
			} else if (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!') {
				sb.append(str.charAt(i));
				if (str.charAt(i + 1) != ' ') {
					sb.append(' ');
					i++;
				}
				sb.append(Character.toUpperCase(str.charAt(i)));
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = scanner.nextLine().trim();
		String formatedString = formatString(string);
		System.out.println("After formatting: " + formatedString);
		scanner.close();
	}
}
