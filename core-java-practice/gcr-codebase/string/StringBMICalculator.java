import java.util.Scanner;

public class StringBMICalculator {

	public static String[] calculateBMI(double weightKg, double height) {
		double bmi = weightKg / ((height / 100) * (height / 100));
		String status;
		if (bmi < 18.5) {
			status = "Underweight";
		} else if (bmi < 25) {
			status = "Normal";
		} else if (bmi < 30) {
			status = "Overweight";
		} else {
			status = "Obese";
		}
		return new String[] { String.format("%.2f", bmi), status };
	}

	public static String[][] helper(double[][] data) {
		String[][] result = new String[10][4];
		for (int i = 0; i < 10; i++) {
			double weight = data[i][0];
			double height = data[i][1];
			String[] bmiData = calculateBMI(weight, height);
			result[i][0] = String.valueOf(height);
			result[i][1] = String.valueOf(weight);
			result[i][2] = bmiData[0];
			result[i][3] = bmiData[1];
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double[][] data = new double[10][2];

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter details for Person " + (i + 1));

			System.out.print("Weight (kg): ");
			data[i][0] = scanner.nextDouble();

			System.out.print("Height (cm): ");
			data[i][1] = scanner.nextDouble();
		}

		String[][] result = helper(data);
		System.out.println("Height(cm) Weight(kg) BMIStatus");

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t" + result[i][3]);
		}

		scanner.close();
	}
}
