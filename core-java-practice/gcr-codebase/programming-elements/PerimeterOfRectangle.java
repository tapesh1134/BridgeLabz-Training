
import java.util.Scanner;

public class PerimeterOfRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        System.out.print("Perimeter of rectangle: " + 2 * (length + breadth));
        sc.close();
    }
}
