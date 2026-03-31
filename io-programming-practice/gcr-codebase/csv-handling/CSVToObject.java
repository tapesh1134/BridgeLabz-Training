
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {

    private int id;
    private String name;
    private int age;
    private int marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", age=" + age
                + ", marks=" + marks
                + '}';
    }
}

public class CSVToObject {

    public static void main(String[] args) {
        String fileName = "students.csv";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\t");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                int marks = Integer.parseInt(data[3]);

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
