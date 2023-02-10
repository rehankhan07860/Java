import java.util.Scanner;

public class Addiition {
    public static void main(String[] args){
        double a, b, c;

        System.out.println("Enter Your First Number: ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        System.out.println("Enter your Second Number: ");
        b = sc.nextInt();
        System.out.println("Enter Your Third Number: ");
        c = sc.nextInt();
        double sum = a + b + c;
        System.out.println("Sum Is: "+ sum);

    }
}
