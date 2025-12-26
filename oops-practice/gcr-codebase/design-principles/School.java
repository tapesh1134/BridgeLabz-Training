import java.util.*;

class Student {
	String name;
	List<Course> courses = new ArrayList<>();

	public Student(String name) {
		this.name = name;
	}

	public void enroll(Course c) {
		courses.add(c);
		c.students.add(this);
	}

	public void viewCourses() {
		System.out.println(name + "'s Courses:");
		for (Course c : courses)
			System.out.println("- " + c.name);
	}
}

class Course {
	String name;
	List<Student> students = new ArrayList<>();

	public Course(String name) {
		this.name = name;
	}

	public void viewStudents() {
		System.out.println("Students in " + name + ":");
		for (Student s : students)
			System.out.println("- " + s.name);
	}
}

public class School {
	String name;
	List<Student> students = new ArrayList<>();

	public School(String name) {
		this.name = name;
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public static void main(String[] args) {
		School school = new School("GLA");
		Student s1 = new Student("Aman");
		Student s2 = new Student("Riya");
		Course java = new Course("Java");
		Course dsa = new Course("DSA");
		school.addStudent(s1);
		school.addStudent(s2);
		s1.enroll(java);
		s1.enroll(dsa);
		s2.enroll(java);
		s1.viewCourses();
		java.viewStudents();
	}
}
