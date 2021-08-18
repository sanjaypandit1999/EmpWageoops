package com.bridgelabz;

public class CalEmpWage {
    /**
     * Check amployee attendance
     *
     * @author Sanjay
     * @version 2.0
     * @since 18-08-2021
     */
    public static final int IS_PRESENT = 1;
    public static final int FULL_TIME_WORKING_HR = 0;

    public static int attendanceCheck() {
        int workingHrPerDay = FULL_TIME_WORKING_HR;
        double empRandomCheck = Math.floor(Math.random()*10)%2;
        if (empRandomCheck == IS_PRESENT) {
            workingHrPerDay = 8;
                System.out.println("Employee is Present");
        } else {
            workingHrPerDay= 0;
            System.out.println("Employee is Absent");
        }
        return workingHrPerDay;
    }
    public int dailyWage(int workingHrPerDay) {

        int WAGE_PER_HRS = 20;

        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println("Daily wage: " + dailyWage);

        return dailyWage;
    }
}
