package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.println("First Name: ");
        String firstName = userInput.nextLine();

        System.out.println("Middle name: ");
        String middleName = userInput.nextLine();

        System.out.println("Last name: ");
        String lastName = userInput.nextLine();

        System.out.println("Suffix: ");
        String suffix = userInput.nextLine();

        String name = firstName + middleName + lastName + suffix;


        if (middleName.isBlank() && suffix.isBlank()) {
            System.out.println(firstName + " " + lastName);
        } else if (middleName.isBlank()) {
            System.out.println("Full name: " + firstName + " " + lastName + "," + " " + suffix);
        } else if (suffix.isBlank()) {
            System.out.println("Full name: " + firstName + " " + middleName + "." + " " + lastName);
        } else {
            System.out.println("Full name: " + firstName + " " + middleName + "." + " " + lastName + "," + " " + suffix);
        }

    }


}


