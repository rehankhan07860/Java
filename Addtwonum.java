import java.util.Scanner;

public class Addtwonum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number and second number: ");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Sum is: " + c);


    }
}
