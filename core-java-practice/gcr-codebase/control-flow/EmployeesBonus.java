import java.util.Scanner;

public class EmployeesBonus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter salary: ");
		int salary = scanner.nextInt();
		System.out.print("Enter years of service: ");
		int yearOfService = scanner.nextInt();
		System.out.printf(yearOfService > 5
				? "Year of service " + yearOfService + " and salary is " + salary + " then bonus is " + (salary * 0.05)
				: "Year of service less than 5");
		scanner.close();
	}

}
