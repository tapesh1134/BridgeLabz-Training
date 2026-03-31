import java.util.Scanner;

public class TextAnalyzer {
	public static int countWords(String paragraph) {
		return paragraph.split(" ").length;
	}

	public static String findLongestWord(String paragraph) {
		String[] words = paragraph.split(" ");
		String result = words[0];
		for (String str : words) {
			if (str.length() > result.length()) {
				result = str;
			}
		}
		return result;
	}

	public static String replaceWord(String paragraph, String target, String replacement) {
		String[] words = paragraph.split(" ");
		StringBuilder result = new StringBuilder();
		for (String str : words) {
			if (str.equals(target)) {
				result.append(replacement);
			} else {
				result.append(str);
			}
			result.append(" ");
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a paragraph: ");
		String paragraph = scanner.nextLine().trim();
		System.out.println("Word Count: " + countWords(paragraph));
		System.out.println("Longest Word: " + findLongestWord(paragraph));
		System.out.print("Enter word to replace: ");
		String target = scanner.next();
		System.out.print("Enter replacement word: ");
		String replacement = scanner.next();
		String updatedParagraph = replaceWord(paragraph, target, replacement);
		System.out.println("Updated Paragraph:");
		System.out.println(updatedParagraph);
		scanner.close();
	}
}
