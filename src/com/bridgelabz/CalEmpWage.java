package com.bridgelabz;

public class CalEmpWage {
        /**
         * Check amployee attendance
         *
         * @author Sanjay
         * @version 2.0
         * @since 18-08-2021
         */
        public static final int ISPRESENT = 1;

        public void attendenceCheck(){
            //randomcheck
            double empRandomCheck = Math.floor(Math.random()*10) %2;
            if (empRandomCheck == ISPRESENT){
                System.out.println("Employee Is Present");
            }
            else {
                System.out.println("employee is absent");
            }
        }
}
