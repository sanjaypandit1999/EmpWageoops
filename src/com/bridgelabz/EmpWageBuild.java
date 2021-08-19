package com.bridgelabz;

public class EmpWageBuild {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //creat object for call the methods
        CalEmpWage monthlyWage = new CalEmpWage();
        int monthlyhWage = monthlyWage.monthlyWage();
        System.out.println("Employee monthly wage is " +monthlyhWage);
    }
}
