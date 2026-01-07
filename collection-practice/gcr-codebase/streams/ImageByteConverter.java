
import java.io.*;

public class ImageByteConverter {

    public static void main(String[] args) {
        try {
            FileInputStream inputImage = new FileInputStream("image.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int b;
            while ((b = inputImage.read()) != -1) {
                baos.write(b);
            }
            byte[] imageByte = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(imageByte);
            FileOutputStream fos = new FileOutputStream("output.jpg");
            while ((b = bais.read()) != -1) {
                fos.write(b);
            }
            inputImage.close();
            fos.close();
            System.out.println("Image copied successfully.");
        } catch (IOException e) {
            System.out.println("Error processing image.");
        }
    }
}
