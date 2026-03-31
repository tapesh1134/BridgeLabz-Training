
import java.util.Scanner;

public class NumberFactors {

    public static int[] findFactors(int num) {
        int countFactors = 0;
        for (int i = 2; i <= num / 2 + 1; i++) {
            if (num % i == 0) {
                countFactors++;
            }
        }
        int factor[] = new int[countFactors];
        int index = 0;
        for (int i = 2; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                factor[index++] = i;
            }
        }
        return factor;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int i : factors) {
            sum += i;
        }
        return sum;
    }

    public static int findProduct(int[] factors) {
        int sum = 1;
        for (int i : factors) {
            sum *= i;
        }
        return sum;
    }

    public static int[] findSquare(int[] factors) {
        int square[] = new int[factors.length];
        for (int i = 0; i < factors.length; i++) {
            square[i] = (int) Math.pow(factors[i], 2);
        }
        return square;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);
        int sum = findSum(factors);
        int product = findProduct(factors);
        int[] square = findSquare(factors);
        System.out.println("Factors of number: ");
        for (int i : factors) {
            System.out.print(i + " ");
        }
        System.out.println("\nSum of all factors: " + sum);
        System.out.println("Product of all factors: " + sum);
        System.out.println("Sqaures of all factors: ");
        for (int i : square) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
