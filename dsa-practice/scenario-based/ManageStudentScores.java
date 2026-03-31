import java.util.Scanner;

public class ManageStudentScores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int students = scanner.nextInt();
		System.out.print("Enter number of subjects: ");
		int subjects = scanner.nextInt();
		int[][] scores = new int[students][subjects];
		int[] average = new int[students];
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		for (int i = 0; i < students; i++) {
			System.out.println("Enter marks for student " + (i + 1));
			int sum = 0;
			for (int j = 0; j < subjects; j++) {
				int mark = scanner.nextInt();
				if (mark < 0) {
					System.out.println("Enter correct marks");
					mark = scanner.nextInt();
				}
				sum += mark;
				scores[i][j] = mark;
				if (mark < lowest) {
					lowest = mark;
				}
				if (mark > highest) {
					highest = mark;
				}
			}
			average[i] = sum / subjects;
		}
		int averageScore = 0;
		for (int i : average) {
			averageScore += i;
		}
		averageScore /= students;
		System.out.println("Average score of class: " + averageScore);
		System.out.println("Average score  of students: ");
		for (int i = 0; i < average.length; i++) {
			System.out.printf("Student %d = %d: %s%n", i + 1, average[i], average[i] > averageScore ? "Above average"
					: average[i] == averageScore ? "Average" : "Below average");
		}
	}

}
