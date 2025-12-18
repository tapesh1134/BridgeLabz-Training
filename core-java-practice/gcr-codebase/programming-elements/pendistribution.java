
import java.util.Scanner;

public class pendistribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pen: ");
        int pen = sc.nextInt();
        System.out.print("Enter number of Students: ");
        int students = sc.nextInt();
        System.out.printf("The Pen Per Student is %d and the remaining pen and distribution is %d", pen / students, pen % students);
        sc.close();
    }
}
