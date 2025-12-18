
import java.util.Scanner;

public class triangearea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.printf("Area of triangle %.2f while in inches is %.2f", (double) (0.5 * base * height), (double) (0.5 * base * height) / 2.54);
        sc.close();
    }
}
