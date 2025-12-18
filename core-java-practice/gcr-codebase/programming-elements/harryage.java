
import java.util.Scanner;

public class harryage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of birth: ");
        int yearofbirth = sc.nextInt();
        System.out.print("Harry's age in 2024 is " + (2024 - yearofbirth));
        sc.close();
    }
}
