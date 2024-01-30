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

        System.out.println("The area of the circle is: " + area_of_circle);

    }
}
