import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values to multiply: ");
        int n = sc.nextInt();

        long product = 1;   // using long to handle larger results

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            product *= num;
        }

        System.out.println("The product of the numbers is: " + product);

        sc.close();
    }
}

