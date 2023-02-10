import java.net.Socket;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        int num1, num2, gcd = 1;
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        for (int i = 1; i<=num1 && i<=num2 ; ++i){
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;

        }
        System.out.println("GCD of " + num1 + "and "+ num2+ "is "+ gcd);
    }
}
