
import java.util.Scanner;

public class Course {
	String courseName;
	double duration;
	double fee;
	static String institudeName = "GLA";

	public Course(String courseName, double duration, double fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}

	public void displayCourseDetails() {
		System.out.printf("Course name: %s%nDuration: %.2f%nFee: %.2f%nInstitude name: %s%n", courseName, duration, fee,
				institudeName);
	}

	public static void updateInstituteName(String newName) {
		institudeName = newName;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter course name: ");
		String cName = scanner.next();
		System.out.print("Enter duration: ");
		double duration = scanner.nextDouble();
		System.out.print("Enter fee: ");
		double fee = scanner.nextDouble();
		Course c1 = new Course(cName, duration, fee);
		c1.displayCourseDetails();
		System.out.println("After changing institude name: ");
		Course.updateInstituteName("DPS");
		c1.displayCourseDetails();
		scanner.close();
	}
}
