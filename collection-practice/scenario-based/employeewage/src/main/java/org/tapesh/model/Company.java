package org.tapesh.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private double WagePerHour;
    private int workingDays;
    private int workingHours;
    private double totalWage;
    private List<Double> dailyWages;
    public Company(String name,double WagePerHour,int workingDays,int workingHours){
        this.name = name;
        this.WagePerHour = WagePerHour;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
        this.dailyWages = new ArrayList<>();
    }
    public void addDailyWage(double wage) {
        dailyWages.add(wage);
    }

    public void setTotalWage(double totalWage) {
        this.totalWage = totalWage;
    }

    public String getName() {
        return name;
    }

    public double getDailyWage() {
        return WagePerHour;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public double getTotalWage() {
        return totalWage;
    }

    public List<Double> getDailyWages() {
        return dailyWages;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", WagePerHour=" + WagePerHour +
                ", workingDays=" + workingDays +
                ", workingHours=" + workingHours +
                ", totalWage=" + totalWage +
                ", dailyWages=" + dailyWages +
                '}';
    }
}
