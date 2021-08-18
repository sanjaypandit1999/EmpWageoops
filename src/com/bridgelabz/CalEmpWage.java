package com.bridgelabz;

public class CalEmpWage {
    /**
     * Check amployee attendance
     *
     * @author Sanjay
     * @version 2.3
     * @since 18-08-2021
     */
    public static final int IS_PRESENT = 1, IS_PART_TIME_PRESENT = 2;

    public static int attendanceCheck() {
        int workingHrPerDay = 0 ;
        double empRandomCheck = Math.floor(Math.random()*10)%3;
        if (empRandomCheck == IS_PRESENT) {
            workingHrPerDay = 8;
            System.out.println("Employee is Present");
        }else if (empRandomCheck == IS_PART_TIME_PRESENT) {
            System.out.println("Employee is part time ");
            workingHrPerDay = 4;
        }else{
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
