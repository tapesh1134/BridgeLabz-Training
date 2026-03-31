
import java.io.BufferedReader;
import java.io.FileReader;

public class FilterCSVRecords {

    public static void main(String[] args) {
        String filePath = "students.csv";
        String data;
        System.out.println("Student with marks greater than 80");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            while ((data = reader.readLine()) != null) {
                String line[] = data.split("\\t");
                int id = Integer.parseInt(line[0]);
                String name = line[1];
                int age = Integer.parseInt(line[2]);
                int marks = Integer.parseInt(line[3]);
                if (marks > 80) {
                    System.out.println("\nID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Marks: " + marks);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
