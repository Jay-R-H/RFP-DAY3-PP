package com.programming;

public class EmployeeWageSwitchStatement {

    public static void main(String[] args) {
         final int isFullTime =1;
         final int isPartTime =2;
         int wagePerHr =20;
         int totalWage =0;
         int maxWorkingDays=20;
         int maxWorkingHrs=100;
         int totalWorkingHrs =0;
         int totalWorkingDays=0;
         int wage;
         int workingHrs;

         while (maxWorkingDays > totalWorkingDays && maxWorkingHrs > totalWorkingHrs ){
             int employeeCheck = (int) Math.floor((Math.random() * 10) % 3);
             totalWorkingDays++;

             switch (employeeCheck){

                 case isFullTime:
                     workingHrs =8;
                     System.out.println("The employee has worked for " + workingHrs + " hrs");
                     break;
                 case isPartTime:
                     workingHrs =4;
                     System.out.println("The employee has worked for " + workingHrs + " hrs");
                     break;
                 default:
                     workingHrs =0;
                     System.out.println("The employee has worked for " + workingHrs + " hrs");
                     break;
             }
             totalWorkingHrs+=workingHrs;
             wage = wagePerHr * workingHrs;
             System.out.println("The employee has earned " + wage);
             totalWage+=wage;
         }
        System.out.println("The employee has totally worked " + totalWorkingHrs + " hrs");
        System.out.println("The employee has  totally earned " + totalWage + "$");
    }
}
