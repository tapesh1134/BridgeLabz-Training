import java.util.Scanner;

public class CanVote {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the age of person: ");
		int age = scanner.nextInt();
		if(age >= 18) {
			System.out.printf("The person's age is %d and can vote",age);
		} else {
			System.out.printf("The person's age is %d and cannot vote",age);
		}
		scanner.close();
	}

}
