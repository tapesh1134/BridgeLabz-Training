import java.util.Scanner;

public class DivisiblityByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		System.out.printf("Is the number %d divisible by 5: %s", input, input % 5 == 0 ? "Yes" : "No");
		sc.close();
	}

}
