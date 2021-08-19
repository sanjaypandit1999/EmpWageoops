package com.bridgelabz;

public class EmpWageBuild {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        //creat object for call the methods
        CalEmpWage switchCase = new CalEmpWage();
        int workingHrPerDay = switchCase.switchCase();
        //call daiywage method for calculate daily wage
        switchCase.dailyWage(workingHrPerDay);
    }
}
