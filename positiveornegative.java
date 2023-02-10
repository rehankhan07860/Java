import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice Number: ");
        double number;
        number = sc.nextDouble();
        if (number > 0){
            System.out.println("This is Positive Number: "+ number);
        }else {
            System.out.println("This is negative Number: " + number);
        }
    }
}
