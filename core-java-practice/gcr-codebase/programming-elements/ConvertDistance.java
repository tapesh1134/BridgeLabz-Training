
import java.util.Scanner;

public class ConvertDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in yards: ");
        int yards = sc.nextInt();
        System.out.printf("Distance in yards %d, distance in miles %.2f, distance in feet %d", yards, (double) yards / 1760, 3 * yards);
        sc.close();
    }
}
