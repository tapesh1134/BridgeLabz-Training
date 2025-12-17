
import java.util.Scanner;

public class simpleinterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        int amount = sc.nextInt();
        System.out.print("Enter Rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Enter Time period in years: ");
        int time = sc.nextInt();
        float simpleinterest = (amount * rate * time) / 100;
        System.out.print("Simple Interest is: " + simpleinterest);
        sc.close();
    }
}
