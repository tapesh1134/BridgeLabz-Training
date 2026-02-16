package org.tapesh;

import org.tapesh.interfaces.EmployeeWageBuilder;
import org.tapesh.model.InvalidEmplayeeWageExpection;
import org.tapesh.service.EmpWageBuilder;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws InvalidEmplayeeWageExpection {
        Scanner sc = new Scanner(System.in);
        EmployeeWageBuilder builder = new EmpWageBuilder();
        System.out.println("Enter company name: ");
        String name = sc.nextLine();
        System.out.println("Enter wage per hour: ");
        double wagePerHour = sc.nextDouble();
        System.out.println("Enter total working days: ");
        int workingDays = sc.nextInt();
        System.out.println("Enter total working hours: ");
        int workingHours = sc.nextInt();
        builder.addCompany(name,wagePerHour,workingDays,workingHours);

        builder.computeWage();
        System.out.printf("%s Total Wage: %.2f",name, builder.getTotalWage(name));
        sc.close();
    }
}
