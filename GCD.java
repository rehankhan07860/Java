import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter your choice GCD Number: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Enter your choice GCD Number: ");
        int number2 = sc.nextInt();
        int gcd = hcf(number1,number2);
        System.out.println("GCD = "+gcd);

    }
    public static int hcf(int number1,int number2){
        if (number2 != 0){
        return hcf(number2, number1 % number2);
    }else {
            return number1;
        }
        }
}
