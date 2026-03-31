
import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
        File input = new File("input.txt");
        File output = new File("ouput.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            if (!input.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }
            fis = new FileInputStream(input);
            fos = new FileOutputStream(output);
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error while reading or writing file");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing file");
            }
        }
    }
}
