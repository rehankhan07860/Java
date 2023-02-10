import java.util.Scanner;

public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice counting: ");
        int num;
        num = sc.nextInt();
        for (int i = 1; i<=num; i++){
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}
