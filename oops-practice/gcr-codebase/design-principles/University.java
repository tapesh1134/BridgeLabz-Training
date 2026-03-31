import java.util.*;

class Faculty {
	String name;

	public Faculty(String name) {
		this.name = name;
	}
}

class Department {
	String name;

	public Department(String name) {
		this.name = name;
	}
}

public class University {
	String name;
	List<Department> departments = new ArrayList<>();
	List<Faculty> faculties = new ArrayList<>();

	public University(String name) {
		this.name = name;
	}

	public void addDepartment(String deptName) {
		departments.add(new Department(deptName));
	}

	public void addFaculty(Faculty f) {
		faculties.add(f);
	}

	public void deleteUniversity() {
		departments.clear();
		System.out.println("University deleted");
	}

	public static void main(String[] args) {
		Faculty f1 = new Faculty("Dr. Sharma");
		University uni = new University("GLA University");
		uni.addDepartment("CSE");
		uni.addDepartment("ECE");
		uni.addFaculty(f1);
		uni.deleteUniversity();
		System.out.println("Faculty still exists: " + f1.name);
	}
}
