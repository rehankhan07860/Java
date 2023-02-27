import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice number: ");
        int num = sc.nextInt();
        boolean flase = false;
        boolean flag = flase;
        for (int i = 2; i<num / 2; i++){
           if (num % i == 0){
               flag = true;
               break;
           }
        }
        if (!flag){
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }
    }
}
