
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        String mainFile = "main.txt";
        String newFile = "duplicate.txt";
        try (
                FileInputStream fis = new FileInputStream(mainFile); FileOutputStream fos = new FileOutputStream(newFile)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("Copy successfully done");

        } catch (IOException e) {
            System.out.println("Main file not found");
        }
    }
}
