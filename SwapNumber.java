import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter your choice First Number: ");
     /*   double num1;
        num1 = sc.nextDouble();
        System.out.println("Enter your choice Second Number: ");
        double num2;
        num2 = sc.nextDouble();
        System.out.println("Enter your Choice Third Number: ");
        double num3;
        num3 = sc.nextDouble();
        num1 = num2;
        num2 = num3;
        num3 = num1;
        System.out.println("First Number is: " +num1);
        System.out.println("Second Number is: " +num2);
        System.out.println("Third Number is: " +num3);
*/
        System.out.println("Enter your first number: ");
        double num1;
        num1 = sc.nextDouble();
        System.out.println("Enter your Secind Number: ");
        double num2;
        num2 = sc.nextDouble();
         double temp;
         temp = num1;
        num1 = num2;
        num2 =temp;

        System.out.println("First Number is: " + num1);
        System.out.println("Second Number is: "+ num2);
    }
}
