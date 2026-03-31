package org.tapesh.interfaces;

import org.tapesh.model.InvalidEmplayeeWageExpection;

public interface EmployeeWageBuilder {
    void addCompany(String name,double WagePerHour,int workingDays,int workingHours) throws InvalidEmplayeeWageExpection;
    void computeWage();
    double getTotalWage(String companyName);
}
