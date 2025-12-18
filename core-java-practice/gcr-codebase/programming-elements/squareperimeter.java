
import java.util.Scanner;

public class squareperimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side = sc.nextInt();
        System.out.printf("The length of the side is %d whose perimeter is %d", side, 4 * side);
    }
}
