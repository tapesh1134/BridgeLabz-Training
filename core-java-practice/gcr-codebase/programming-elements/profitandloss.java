
import java.util.Scanner;

public class profitandloss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price in INR: ");
        int costprice = sc.nextInt();
        System.out.print("Enter selling price in INR: ");
        int sellprice = sc.nextInt();
        System.out.printf("The Cost Price int INR %d and Selling Price in INR %d%nThe Profit is INR %d and the Profit Percentage is %.2f", costprice, sellprice, (sellprice - costprice), (double) (sellprice - costprice) / costprice * 100);
    }
}
