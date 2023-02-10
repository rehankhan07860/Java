import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        double num1, num2, swap;
        num1 = sc.nextDouble();
        System.out.println("Enter Your Second Number: ");
        num2 = sc.nextDouble();
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("Swap First Number is: " + num1);
        System.out.println("Swap Second Number is: " + num2);
    }
}
