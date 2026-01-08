
import java.io.*;

public class CopyFileUsingBufferStream {

    public static void main(String[] args) {
        File input = new File("input.txt");
        File output = new File("output.txt");
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            if (!input.exists()) {
                System.out.println("Main file not exist");
                return;
            }
            bis = new BufferedInputStream(new FileInputStream(input));
            bos = new BufferedOutputStream(new FileOutputStream(output));
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error when read or write in file");
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                System.out.println("Error on closing file");
            }
        }
    }
}
