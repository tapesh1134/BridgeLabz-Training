
import java.util.Scanner;

public class UniversityDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fees of university: ");
        int fees = sc.nextInt();
        System.out.print("Enter the discount: ");
        int discountPercentage = sc.nextInt();
        System.out.printf("The fees you have to pay by subtracting the discount from the fee: %.2f", (double) fees - fees / discountPercentage);
        sc.close();
    }
}
