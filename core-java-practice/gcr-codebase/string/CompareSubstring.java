import java.util.Scanner;

public class CompareSubstring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String mainString = scanner.next();
		System.out.print("Enter starting index: ");
		int start = scanner.nextInt();
		System.out.print("Enter ending index: ");
		int end = scanner.nextInt();
		String subString = mainString.substring(start, end);
		StringBuilder charString = new StringBuilder();
		for (int i = start; i < end; i++) {
			charString.append(mainString.charAt(i));
		}
		System.out.printf("Substring using substring() method is %s%n", subString);
		System.out.printf("Substring using charAt() method is %s%n", charString);
		System.out.printf("Substring using charAt() and substring() are %s",
				subString.equals(charString.toString()) ? "equal" : "not equal");
		scanner.close();
	}
}
