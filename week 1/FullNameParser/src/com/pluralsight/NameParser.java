package com.pluralsight;

import java.util.Scanner;

public class NameParser {
    public static void main(String[]args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String name = userInput.nextLine();

        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0,spaceIndex);
        String middleName;
        String lastName;
        int secondSpaceIndex = name.lastIndexOf(" ");

    if (name.contains(".")) {
       middleName = name.substring(spaceIndex,secondSpaceIndex);
        lastName = name.substring(secondSpaceIndex + 1);
    }
    else {
        middleName = "(none)";
        lastName = name.substring(spaceIndex + 1);
    }


        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName );



    }

}