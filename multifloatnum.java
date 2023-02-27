import java.util.Scanner;

public class multifloatnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two floating number: ");
        float a,b;
        float product;
        a = scanner.nextFloat();
        b = scanner.nextInt();
        product = a * b;
        System.out.println("Your answer is: " + product);
    }
}
