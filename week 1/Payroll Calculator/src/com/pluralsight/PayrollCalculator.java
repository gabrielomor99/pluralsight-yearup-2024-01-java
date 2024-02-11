package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args){
       Scanner userInput = new Scanner(System.in);

       String name;
       double hoursWorked;
       double payRate;

        System.out.println("Please enter your name:");
        name = userInput.nextLine().trim();
        System.out.println("Please enter your hours worked:");
        hoursWorked = userInput.nextDouble();
        System.out.println("Please enter your pay rate:");
        payRate = userInput.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.println( name + " your gross pay is " + grossPay);


    }
}