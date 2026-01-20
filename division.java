
//junit assignment 

import java.util.Scanner;

public class division  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Edge case: division by zero
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        // Edge case: integer overflow check
        else if (a == Integer.MIN_VALUE && b == -1) {
            System.out.println("Error: Integer overflow.");
        }
        else {
            double result = a / b;
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
