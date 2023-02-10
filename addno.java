import java.util.Scanner;

public class addno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number: ");
        double num1 = sc.nextInt();
        System.out.println("Enter Your Second Number: 5");

        double num2 = sc.nextInt();
        double num3 = num1 + num2;
        System.out.println("Sum is: " +num3);

    }
}
