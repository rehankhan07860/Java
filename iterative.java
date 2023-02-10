import java.util.Scanner;

public class iterative {

    static int factorial(int n){
        if (n ==0 || n ==1){
            return 1;
        }else {
            int product = 1;
            for (int i =1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice number: ");
        int n;
        n = sc.nextInt();
        System.out.println(factorial(n));

    }
}
