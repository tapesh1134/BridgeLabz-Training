
import java.util.Scanner;

public class findprice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price od unit in INR: ");
        int unitPrice = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.printf("The total purchase price is INR %d if the quantity %d and unit price is INR %d", unitPrice * quantity, quantity, unitPrice);
        sc.close();
    }
}
