import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        int number;
        System.out.println("Enter your counting table: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(number * i);
        }
    }
}
