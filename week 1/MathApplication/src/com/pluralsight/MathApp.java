public class MathApp {
    public static void main(String[] args) {
int bobSalary = 50000;
int garySalary = 70000;
int highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary);

int carPrice = 3000;
int truckPrice = 4000;
int smallestValue = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestValue);

float radius = 7.25f;
double area_of_circle = Math.PI*Math.pow(radius,2);
    System.out.println("The area of the circle is: " + Math.round(area_of_circle));

    double number = 5.0;
    double squareRoot = Math.sqrt(number);
        System.out.println("The square root of the number is: " + squareRoot);

        double positiveValue = -3.5;
        System.out.println("The positive value is: " + Math.abs(positiveValue));

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is: " + distance);


        double randomNum = Math.random() * 10;
        System.out.println("The random Num is: " + randomNum);




    }
}
