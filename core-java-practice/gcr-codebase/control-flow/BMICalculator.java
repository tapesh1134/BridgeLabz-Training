import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter weight in kg: ");
		double weight = scanner.nextDouble();
		System.out.print("Enter height in cm: ");
		double height = scanner.nextDouble();

		double bmi = weight / Math.pow(height / 100, 2);

		if (bmi < 18.5) {
			System.out.println("Weight Status: Underweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Status: Normal weight");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Status: Overweight");
		} else {
			System.out.println("Status: Obese");
		}
		scanner.close();
	}
}
