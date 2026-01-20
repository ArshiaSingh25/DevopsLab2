import java.util.Scanner;

///making changes to this code in my branch(subtract-branch)

public class subtract{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        float a = sc.nextInt();

        System.out.println("Enter second number");
        float b = sc.nextInt();

        float res = a - b;
        System.out.println("Result = " + res);
        
        sc.close();
    }
}