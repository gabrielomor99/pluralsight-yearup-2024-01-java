package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name;
        double hoursWorked;
        double payRate;
        double grossPay;

        System.out.println("Enter your name");
        name = userInput.nextLine();

        System.out.println("Enter hours worked");
        hoursWorked = userInput.nextDouble();

        System.out.println("Enter pay rate");
        payRate = userInput.nextDouble();

      grossPay = hoursWorked * payRate;

        System.out.println();
        System.out.println(name + " "+"your gross pay is" + " "+ grossPay);
    }

}
