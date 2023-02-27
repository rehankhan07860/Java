import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice Base number: ");
        int base = sc.nextInt();
        System.out.println("Enter your Exponent number: ");
        int exponent = sc.nextInt();
        int result = 1;
        while (exponent != 0){
            result = result * base;
            --exponent;
        }
        System.out.println("Result is: " + result);
    }
}
