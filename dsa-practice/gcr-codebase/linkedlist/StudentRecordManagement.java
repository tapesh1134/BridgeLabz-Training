class Student {
	private String name;
	private int age;
	private int rollNumber;
	private int grade;
	private Student next;

	public Student(String name, int age, int rollNumber, int grade) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}

	public void setNext(Student next) {
		this.next = next;
	}

	public Student getNext() {
		return this.next;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getRollNumber() {
		return this.rollNumber;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}

public class StudentRecordManagement {
	private Student head;
	private Student tail;

	public void addAtFront(Student student) {
		student.setNext(head);
		this.head = student;
		if (tail == null) {
			tail = student;
		}
	}

	public void addAtLast(Student student) {
		if (tail == null) {
			addAtFront(student);
			return;
		}
		tail.setNext(student);
		this.tail = this.tail.getNext();
	}

	public void addAtPosition(Student student, int position) {
		if (position <= 1 || head == null) {
			addAtFront(student);
			return;
		}

		Student temp = head;
		int count = 1;

		while (temp.getNext() != null && count < position - 1) {
			temp = temp.getNext();
			count++;
		}

		student.setNext(temp.getNext());
		temp.setNext(student);

		if (student.getNext() == null) {
			tail = student;
		}
	}

	public Student searchStudent(int rollNumber) {
		Student temp = head;
		while (temp != null) {
			if (temp.getRollNumber() == rollNumber) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	public void deleteStudent(int rollNumber) {
		if (head == null) {
			return;
		}

		if (head.getRollNumber() == rollNumber) {
			head = head.getNext();
			if (head == null) {
				tail = null;
			}
			return;
		}

		Student prev = head;
		Student curr = head.getNext();

		while (curr != null) {
			if (curr.getRollNumber() == rollNumber) {
				prev.setNext(curr.getNext());
				if (curr == tail) {
					tail = prev;
				}
				return;
			}
			prev = curr;
			curr = curr.getNext();
		}
	}

	public void updateGrade(int rollNumber, int newGrade) {
		Student student = searchStudent(rollNumber);
		if (student != null) {
			student.setGrade(newGrade);
		}
	}

	public void displayStudents() {
		Student temp = head;
		while (temp != null) {
			System.out.println("Roll Number: " + temp.getRollNumber() + ", Name: " + temp.getName() + ", Age: "
					+ temp.getAge() + ", Grade: " + temp.getGrade());
			temp = temp.getNext();
		}
	}

	public static void main(String[] args) {
		StudentRecordManagement students = new StudentRecordManagement();
		students.addAtFront(new Student("Shiva", 12, 1, 6));
		students.addAtFront(new Student("Anu", 12, 2, 6));
		students.addAtFront(new Student("Abhishek", 12, 3, 6));
		students.addAtFront(new Student("Richa", 12, 4, 6));
		students.addAtFront(new Student("Diya", 12, 5, 6));
		students.displayStudents();
		students.updateGrade(2, 7);
		students.displayStudents();
	}
}
