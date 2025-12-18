
import java.util.Scanner;

public class heightconversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.printf("Your Height in cm is %d while in feet is %.2f and inches is %.2f", height, (double) height / (12 * 2.54), (double) height / 2.54);
    }
}
