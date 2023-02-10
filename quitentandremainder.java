import java.util.Scanner;

public class quitentandremainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice divisor Number: ");
        double divisor, divider, quotient, remainder;
        divisor = sc.nextDouble();
        System.out.println("Enter Your divider: ");
        divider = sc.nextDouble();
        quotient = divisor / divider;
        remainder = divisor % divider;
        System.out.println("Quotient Number is: " + quotient);
        System.out.println("Remainder Number is: " + remainder);
    }
}
