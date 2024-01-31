import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        String type;
        double result;

        System.out.println("Enter the first number: ");
        firstNumber = Integer.parseInt(userInput.nextLine());

        System.out.println("Enter the second number");
        secondNumber = Integer.parseInt(userInput.nextLine());


        System.out.println("(a)dd");
        System.out.println("(s)ubtract");
        System.out.println("(m)ultply");
        System.out.println("(d)ivide");
        System.out.println("Please select an option");
        type = userInput.nextLine();

        if (type.equals("a")) {
            result = firstNumber + secondNumber;
            System.out.println(result);
        } else if (type.equals("s")) {
            result = firstNumber - secondNumber;
            System.out.println(result);
        } else if (type.equals("m")) {
            result = firstNumber * secondNumber;
            System.out.println(result);
        } else if (type.equals("d")) {
            result = ((double) firstNumber / secondNumber);
            System.out.println(result);
        }

    }

}