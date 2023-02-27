import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FactorialofNaturalno {
    public static void main(String[] args) {
        System.out.println("You want to how many numbers find the factorial:-");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long fact = mulfactorial(number);
        System.out.println("Factorial = "+ fact);
    }
    public static int mulfactorial(int number){
        if (number>=1) {
            return number * mulfactorial(number - 1);
        }else {
            return 1;
        }
    }
}
