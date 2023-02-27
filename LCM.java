import java.util.Scanner;

public class LCM
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; ++i){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        int lcm = (a * b)/gcd;
        System.out.println("LCM IS: " + lcm);
    }
}
