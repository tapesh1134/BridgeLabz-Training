import java.util.Scanner;

public class CalculateHandshakes {
	public static int helper(int students) {
		return (students * (students + 1)) / 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = scanner.nextInt();
		int result = helper(students);
		System.out.println("Total number of students: " + result);
		scanner.close();
	}
}
