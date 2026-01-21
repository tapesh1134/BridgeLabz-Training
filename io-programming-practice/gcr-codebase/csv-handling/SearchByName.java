
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchByName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "employees.csv";
        String line;
        System.out.print("Enter name of employee: ");
        String input = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");
                String name = data[1];
                String deparment = data[2];
                String salary = data[3];
                if (input.equals(name)) {
                    System.out.println("\nName: " + name);
                    System.out.println("Department: " + deparment);
                    System.out.println("Salary: " + salary);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
