import java.util.Scanner;

public class QuitentRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice Dividend Number: ");
        double dividend;
        dividend = sc.nextDouble();
        System.out.println("Enter your choice Divisor Number: ");
        double divisor;
        divisor = sc.nextDouble();
        double quitent = dividend/divisor;
        double remainder = dividend % divisor;
        System.out.println("Quitent is: " + quitent);
        System.out.println("Remainder is: " + remainder);
    }
}
