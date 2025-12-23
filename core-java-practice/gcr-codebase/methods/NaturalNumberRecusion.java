
import java.util.Scanner;

public class NaturalNumberRecusion {

    public static int sumOfNaturalNumber(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sumOfNaturalNumber(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Number is not natural");
            scanner.close();
            return;
        }
        int customSum = sumOfNaturalNumber(number);
        int formulaSum = (number * (number + 1)) / 2;
        System.out.printf("Sum using recusion is %d and using formula is %d", customSum, formulaSum);
        scanner.close();
    }
}
