package com.bridgelabz;

public class CalEmpWage {
    /**
     * Check amployee attendance
     *
     * @author Sanjay
     * @version 2.3
     * @since 18-08-2021
     */
    public static final int IS_PRESENT = 1, IS_PART_TIME_PRESENT = 2, WORKING_DAY_FOR_MONTH = 20;;

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
    /**
     * Purpose - checks attendance and calculate working per hr using case switch method
     *
     * @return workingHrPerDay (8hr, 4hr or 0hr)
     */
    public int switchCase() {

        int workingHrPerDay;
        int rand = (int) (Math.random() * 3);

        switch (rand) {

            case IS_PRESENT:
                System.out.println("Employee is full time ");
                workingHrPerDay = 8;
                break;

            case IS_PART_TIME_PRESENT:
                System.out.println("Employee is part time ");
                workingHrPerDay = 4;
                break;

            default:
                System.out.println("Employee is absent");
                workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }
    /**
     * Purpose - Calculate wage for a month
     *
     * @return monthly wage
     */
    public int monthlyWage() {
        CalEmpWage monthlySalary = new CalEmpWage();

        int monthlyWage = 0;

        for (int i = 1; i <= WORKING_DAY_FOR_MONTH; i++) {
            System.out.println("Day-" + i);
            int workingHrsPerDay = monthlySalary.switchCase();
            int dailyWage = monthlySalary.dailyWage(workingHrsPerDay);

            monthlyWage += dailyWage;
        }
        return monthlyWage;
    }
}
