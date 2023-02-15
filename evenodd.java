import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        int num;
        System.out.println("Enter your any number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("This number is even");
        }else {
            System.out.println("This number is odd ");
        }

    }
}
