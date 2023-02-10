import java.util.Scanner;

public class sumofnaturalno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your natural number:");
        int num , sum = 0;
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
