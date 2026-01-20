import java.util.Scanner;

public class div_modified {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            // Division by zero check
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            double result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        }
        finally {
            sc.close();
            System.out.println("Program execution completed.");
        }
    }
}
