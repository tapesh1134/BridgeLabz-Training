import java.util.Scanner;

class StudentsGrades {
	String name;
	int rollNumber;
	double[] marks;

	StudentsGrades(String name, int rollNumber, double[] marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public String calculateGrade(double[] marks) {
		double totalMarks = calculateTotalMarks(marks);
		if (totalMarks >= 80 && totalMarks <= 100) {
			return "Grade A";
		} else if ((totalMarks >= 60) && (totalMarks < 80)) {
			return "Grade B";
		} else if ((totalMarks >= 50) && (totalMarks < 60)) {
			return "Grade C";
		} else if ((totalMarks >= 40) && (totalMarks < 50)) {
			return "Grade D";
		} else {
			return "Grade F";
		}

	}

	public void displayStudent() {
		System.out.printf("Student Name: %s%n", name);
		System.out.printf("Student RollNumber: %d%n", rollNumber);
		System.out.println("Student Marks: ");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Mark" + (i + 1) + ": " + marks[i]);
		}
		System.out.println(calculateGrade(marks));
	}

	public double calculateTotalMarks(double[] marks) {
		double sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		return sum / 3;
	}

}

public class StudentReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student name: ");
		String sName = scanner.next();
		System.out.print("Enter student roll number: ");
		int rollNo = scanner.nextInt();
		double[] marks = new double[3];
		System.out.println("Enter student Marks: ");
		System.out.print("Marks in first subject: ");
		marks[0] = scanner.nextInt();
		System.out.print("Marks in second subject: ");
		marks[1] = scanner.nextInt();
		System.out.print("Marks in third subject: ");
		marks[2] = scanner.nextInt();

		StudentsGrades student = new StudentsGrades(sName, rollNo, marks);

		student.displayStudent();
	}
}
