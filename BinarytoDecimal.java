import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        System.out.println("Enter your Binary Number:- ");
        Scanner sc = new Scanner(System.in);
        String number = sc.next().toString();
        int decimal = Integer.parseInt(number,2);
        System.out.println("Decimal Number = "+ decimal);
    }
}
