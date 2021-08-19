package com.bridgelabz;

public class CalEmpWage {
    /**
     * Check amployee attendance
     *
     * @author Sanjay
     * @version 2.3
     * @since 18-08-2021
     */
    //declare instance variable
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static String company;
    public static final int empRatePerHr = 0;
    public static final int numofWorkingDays = 0;
    public static final int maxHrPerMonth = 0;

    public static int CalEmpWage(String company, int empRatePerHr, int numofWorkingDays, int maxHrPerMonth) {
        //VARIABLES
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //COMPUTATION
        while (totalEmpHrs <= maxHrPerMonth &&
                totalWorkingDays < numofWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emp Wage for company " + company +" is " + totalEmpWage);
        return totalEmpWage;
    }
}