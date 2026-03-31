class Employee {
	String name;
	int id;
	double salary;
	public void displayDetails() {
		System.out.printf("Employee Name: %s%n", name);
		System.out.printf("Employee id: %d%n", id);
		System.out.printf("Salary: %.2f%n", salary);
	}
}

class Manager extends Employee {
	int teamSize;
	@Override
	public void displayDetails() {
		System.out.printf("Manager Name: %s%n", name);
		System.out.printf("Manager id: %d%n", id);
		System.out.printf("Salary: %.2f%n", salary);
		System.out.printf("Team Size: %d%n", teamSize);
	}
}

class Developer extends Employee {
	String programmingLanguage;
	@Override
	public void displayDetails() {
		System.out.printf("Developer Name: %s%n", name);
		System.out.printf("Developer id: %d%n", id);
		System.out.printf("Salary: %.2f%n", salary);
		System.out.printf("Programming Language:%s%n", programmingLanguage);
	}
}

class Intern extends Employee {
	int durationMonths;
	@Override
	public void displayDetails() {
		System.out.printf("Intern Name: %s%n", name);
		System.out.printf("Intern id: %d%n", id);
		System.out.printf("Salary: %.2f%n", salary);
		System.out.printf("Internship Duration: %d months%n", durationMonths);
	}
}

public class Employees {
	public static void main(String[] args) {
		Employee manager = new Manager();
		manager.name = "Raj";
		manager.id = 1;
		manager.salary = 180000;

		Developer developer = new Developer();
		developer.name = "Amit";
		developer.id = 2;
		developer.salary = 60000;

		Employee intern = new Intern();
		intern.name = "Anil";
		intern.id = 3;
		intern.salary = 10000;

		manager.displayDetails();
		developer.displayDetails();
		intern.displayDetails();
	}
}