package com.bridgelabz;

public class EmpWageBuild {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //creat object for call the methods
        CalEmpWage empWageCalculator = new CalEmpWage();
        int workingHrPerDay = empWageCalculator.attendanceCheck();
        empWageCalculator.dailyWage(workingHrPerDay);
    }
}
