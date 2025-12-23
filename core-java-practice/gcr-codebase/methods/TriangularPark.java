
import java.util.Scanner;

public class TriangularPark {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000;
        double rounds = distance / perimeter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangular park (in meters):");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();
        double result = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds needed to complete 5 km: " + result);
        scanner.close();
    }
}
