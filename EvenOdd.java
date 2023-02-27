import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int number;
        number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("This is Even Number: " + number);
        }else {
            System.out.println("This is Odd Number: " + number);
        }
    }
}
