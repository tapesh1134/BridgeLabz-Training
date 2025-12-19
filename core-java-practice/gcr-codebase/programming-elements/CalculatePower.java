
import java.util.*;

public class CalculatePower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        System.out.println("Result: " + Math.pow(base, exponent));
        sc.close();
    }
}
