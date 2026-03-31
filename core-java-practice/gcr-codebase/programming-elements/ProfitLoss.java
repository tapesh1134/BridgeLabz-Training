
import java.util.Scanner;

public class ProfitLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price in INR: ");
        int costPrice = sc.nextInt();
        System.out.print("Enter selling price in INR: ");
        int sellPrice = sc.nextInt();
        System.out.printf("The Cost Price int INR %d and Selling Price in INR %d%nThe Profit is INR %d and the Profit Percentage is %.2f", costPrice, sellPrice, (sellPrice - costPrice), (double) (sellPrice - costPrice) / costPrice * 100);
        sc.close();
    }
}
