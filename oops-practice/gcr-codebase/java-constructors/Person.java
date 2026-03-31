import java.util.Scanner;

public class Person {
	String name;
	int age;
	String gender;

	public Person() {
		name = "unknown";
		age = 0;
		gender = "unknown";
	}

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Person(Person p) {
		this.name = p.name;
		this.age = p.age;
		this.gender = p.gender;
	}

	public void personDetails() {
		System.out.printf("Name: %s%nAge: %d%nGender: %s%n", name, age, gender);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name of person: ");
		String name = scanner.next();
		System.out.print("Enter age of person: ");
		int age = scanner.nextInt();
		System.out.print("Enter gender of person: ");
		String gender = scanner.next();
		Person p1 = new Person(name, age, gender);
		Person copyP1 = new Person(p1);

		System.out.println("Original person: ");
		p1.personDetails();
		System.out.println("Copy person: ");
		copyP1.personDetails();
		scanner.close();
	}
}
