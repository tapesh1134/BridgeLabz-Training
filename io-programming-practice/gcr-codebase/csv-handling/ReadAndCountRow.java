
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAndCountRow {

    public static void main(String[] args) {
        String filePath = "employees.csv";
        String line;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                int salary = Integer.parseInt(data[3]);

                count++;
                System.out.println("\nId: " + id);
                System.out.println("Name: " + name);
                System.out.println("Department: " + department);
                System.out.println("Salary: " + salary);
            }
            System.out.println("\nNumber of entries in csv: " + count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
