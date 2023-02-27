import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice number: ");
        int number = sc.nextInt();
        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        }
        System.out.println("Total number is: " + count);
    }
}
