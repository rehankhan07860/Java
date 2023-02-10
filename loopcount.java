import java.util.Scanner;

public class loopcount {
    public static void main(String[] args){
        int num;
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<5000; i++){
            num = sc.nextInt();
            System.out.println(num);
        }
    }
}
