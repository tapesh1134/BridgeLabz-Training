
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class IncrementSalary {

    public static void main(String[] args) {
        String filePath = "employees.csv";
        String outputFile = "updated_employees.csv";
        String data;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)); FileWriter writer = new FileWriter(outputFile)) {
            writer.append("ID,Name,Department,Salary\n");
            br.readLine();
            while ((data = br.readLine()) != null) {
                String line[] = data.split(",");
                int id = Integer.parseInt(line[0]);
                String name = line[1];
                String department = line[2];
                int salary = Integer.parseInt(line[3]);

                if (department.equals("CS")) {
                    salary = salary + (salary / 10);
                }
                writer.append(id + "," + name + "," + department + "," + salary + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
