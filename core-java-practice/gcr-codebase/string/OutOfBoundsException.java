import java.util.Scanner;

public class OutOfBoundsException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String mainString = scanner.next();
		try {
			for (int i = 0; i <= mainString.length(); i++) {
				System.out.println(mainString.charAt(i) + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
