import java.util.Scanner;

public class FriendsAgeHeight {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Amar's age: ");
		int amarAge = scanner.nextInt();
		System.out.print("Enter Akbar's age: ");
		int akbarAge = scanner.nextInt();
		System.out.print("Enter Anthony's age: ");
		int anthonyAge = scanner.nextInt();

		System.out.print("Enter Amar's height: ");
		int amarHeight = scanner.nextInt();
		System.out.print("Enter Akbar's height: ");
		int akbarHeight = scanner.nextInt();
		System.out.print("Enter Anthony's height: ");
		int anthonyHeight = scanner.nextInt();

		int minAge = Math.min(amarAge, Math.min(anthonyAge, akbarAge));
		int maxHeight = Math.max(amarHeight, Math.max(anthonyHeight, akbarHeight));

		System.out.printf("Youngest friend is %s%n",
				amarAge == minAge ? "Amar" : akbarAge == minAge ? "Akbar" : "Anthony");
		System.out.printf("Tallest friend is %s%n",
				amarHeight == maxHeight ? "Amar" : akbarHeight == maxHeight ? "Akbar" : "Anthony");
		scanner.close();
	}
}
