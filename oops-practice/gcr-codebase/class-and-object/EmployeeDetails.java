import java.util.Scanner;

class Employee {
	String name;
	int id;
	double salary;

	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void displayEmployee() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee id: " + id);
		System.out.println("Employee Salary: " + salary);
	}
}

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name of employee: ");
		String eName = scanner.next();
		System.out.print("Enter id of employee: ");
		int eId = scanner.nextInt();
		System.out.print("Enter salary of employee: ");
		double eSalary = scanner.nextDouble();
		Employee employee = new Employee(eName, eId, eSalary);
		employee.displayEmployee();
		scanner.close();
	}
}
