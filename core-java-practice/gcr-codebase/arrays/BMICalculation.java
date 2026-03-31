import java.util.Scanner;

public class BMICalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of persons: ");
		int n = scanner.nextInt();
		double[] height = new double[n];
		double[] weight = new double[n];
		double[] bmi = new double[n];
		String[] status = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Person %d Enter height in meters: ", i + 1);
			height[i] = scanner.nextDouble();
			System.out.printf("Person %d Enter weight in kg: ", i + 1);
			weight[i] = scanner.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			bmi[i] = weight[i] / (height[i] * height[i]);
			if (bmi[i] < 18.5) {
				status[i] = "Underweight";
			} else if (bmi[i] < 25) {
				status[i] = "Normal";
			} else if (bmi[i] < 30) {
				status[i] = "Overweight";
			} else {
				status[i] = "Obese";
			}
		}
		System.out.println("BMI Report:");
		for (int i = 0; i < n; i++) {
			System.out.printf("Person %d%n", (i + 1));
			System.out.printf("Height: %.2fm%n", height[i]);
			System.out.printf("Weight: %.2fkg%n", weight[i]);
			System.out.printf("BMI: %.2f%n", bmi[i]);
			System.out.printf("Status: %s%n", status[i]);
		}
		scanner.close();
	}

}
