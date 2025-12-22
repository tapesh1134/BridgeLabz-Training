import java.util.Scanner;

public class IllegalArgumentException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String mainString = scanner.next();
		try {
			String subString = mainString.substring(mainString.length() + 1);
			System.out.println(subString);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}
}
