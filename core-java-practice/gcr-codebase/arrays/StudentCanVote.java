import java.util.Scanner;

public class StudentCanVote {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] students = new int[10];
		for (int i = 0; i < students.length; i++) {
			System.out.printf("Enter age of student number %d: ", i + 1);
			students[i] = scanner.nextInt();
		}
		for (int i : students) {
			if (i < 0) {
				System.err.println("Invalid age");
			} else if (i < 18) {
				System.out.printf("The student with the age %d cannot vote%n", i);
			} else {
				System.out.printf("The student with the age %d can vote%n", i);
			}
		}
		scanner.close();
	}
}
