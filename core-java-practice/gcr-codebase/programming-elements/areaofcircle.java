
import java.util.*;

public class areaofcircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Formula: 2 * pi * r^2
        System.out.println("Enter radius of circle: ");
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
        sc.close();
    }
}
