
import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(sum(num));
        } else {
            System.out.printf("The number %d is not a natural number", num);
        }
        scanner.close();
    }
}
