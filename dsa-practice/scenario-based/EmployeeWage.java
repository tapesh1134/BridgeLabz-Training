import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {
		Random random = new Random();
		int workingDays = 0;
		int workingHours = 0;
		int totalWage = 0;
		while (workingDays < 20 && workingHours < 100) {
			workingDays++;
			int empCheck = random.nextInt(3);
			int empHours = 0;
			switch (empCheck) {
			case 1:
				empHours = 8;
				System.out.println("Day " + workingDays + ": Employee is Full Time");
				break;

			case 2:
				empHours = 4;
				System.out.println("Day " + workingDays + ": Employee is Part Time");
				break;

			default:
				empHours = 0;
				System.out.println("Day " + workingDays + ": Employee is Absent");
			}

			int dailyWage = empHours * 20;
			workingHours += empHours;
			totalWage += dailyWage;
			System.out.println("Daily Hours: " + empHours);
			System.out.println("Daily Wage: " + dailyWage);
			System.out.println();
		}

		System.out.println("FINAL RESULT");
		System.out.println("Total Working Days: " + workingDays);
		System.out.println("Total Working Hours: " + workingHours);
		System.out.println("Total Monthly Wage: " + totalWage);
	}
}
