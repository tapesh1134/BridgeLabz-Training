
import java.util.Scanner;

public class averagemarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in maths out of 100: ");
        int maths = sc.nextInt();
        System.out.print("Enter marks in physics out of 100: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in chemistry out of 100: ");
        int chemistry = sc.nextInt();
        System.out.println("Average marks: " + ((maths + physics + chemistry) / 3));
        sc.close();
    }
}
