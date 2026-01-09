
import java.util.*;

public class ExceptionsInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = null;
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            array = new int[size];
            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Enter index number: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + array[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");

        } finally {
            sc.close();
        }
    }
}
