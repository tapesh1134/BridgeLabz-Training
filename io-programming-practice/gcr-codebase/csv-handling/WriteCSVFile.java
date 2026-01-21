
import java.io.FileWriter;

public class WriteCSVFile {

    public static void main(String[] args) {
        String filePath = "employees.csv";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("ID,Name,Department,Salary\n");
            writer.append("1,Tapesh,CS,50000\n");
            writer.append("2,Ankit,CS,50000\n");
            writer.append("3,Sam,CS,45000\n");
            writer.append("4,Raj,HR,12000\n");
            writer.append("5,Rohan,HR,12000\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
