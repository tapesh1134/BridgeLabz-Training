package org.tapesh.service;

import org.tapesh.interfaces.EmployeeWageBuilder;
import org.tapesh.model.InvalidEmplayeeWageExpection;
import org.tapesh.model.Company;
import org.tapesh.repo.CompanyRepository;

import java.util.Random;

public class EmpWageBuilder implements EmployeeWageBuilder {
    private CompanyRepository repository;

    public EmpWageBuilder() {
        repository = new CompanyRepository();
    }
    public static boolean isValidCompanyName(String name) {
        String regex = "^[A-Za-z]{3,}$";
        return name.matches(regex);
    }

    @Override
    public void addCompany(String name,double wagePerHour,int workingDays,int workingHours) throws InvalidEmplayeeWageExpection{
        if(!isValidCompanyName(name) || wagePerHour < 0.0 || (workingDays < 0 || workingDays > 30) || (workingHours < 0 || workingHours > 200)){
            throw new InvalidEmplayeeWageExpection("Input details are invalid");
        }
        Company company = new Company(name, wagePerHour, workingDays, workingHours);
        repository.addCompany(company);
    }

    @Override
    public void computeWage() {
        for (Company company : repository.getAllCompanies()) {

            int totalWorkingDays = 0;
            int totalWorkingHours = 0;
            double totalWage = 0;

            Random random = new Random();

            while (totalWorkingDays < company.getWorkingDays()
                    && totalWorkingHours < company.getWorkingHours()) {

                totalWorkingDays++;

                int empCheck = random.nextInt(3);
                int empHours = 0;
                switch (empCheck) {
                    case 1:
                        empHours = 8;
                        break;
                    case 2:
                        empHours = 4;
                        break;
                    default:
                        empHours = 0;
                }

                double wagePerHour = empHours * company.getDailyWage();

                totalWorkingHours += empHours;
                totalWage += wagePerHour;

                company.addDailyWage(wagePerHour);
            }
            company.setTotalWage(totalWage);
        }
    }

    @Override
    public double getTotalWage(String companyName) {
        for (Company company : repository.getAllCompanies()) {
            if (company.getName().equals(companyName)) {
                return company.getTotalWage();
            }
        }
        return -1;
    }
}
