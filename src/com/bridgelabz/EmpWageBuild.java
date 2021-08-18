package com.bridgelabz;

public class EmpWageBuild {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        CalEmpWage attendanceCheck = new CalEmpWage();
        CalEmpWage empWageCalculator = new CalEmpWage();

        attendanceCheck.attendanceCheck();
        int workingHrPerDay = empWageCalculator.attendanceCheck();
        empWageCalculator.dailyWage(workingHrPerDay);
    }
}
