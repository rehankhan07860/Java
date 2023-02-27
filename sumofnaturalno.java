import java.util.Scanner;

public class sumofnaturalno {
    public static void main(String[] args) {
     /*   int number = 20;
        int sum = addNumber(number);
        System.out.println("Sum = "+ sum);
    }
    public static int addNumber(int num){
        if (num !=0){
            return num + addNumber(num - 1);
        }else {
            return num;
        }*/

        System.out.println("You want to add how many natural number:- ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = addNumber(number);
        System.out.println("Sum = "+ sum);
    }
    public static int addNumber(int num){
        if (num != 0){
            return num + addNumber(num - 1);
        }else {
            return num;
        }
    }
}
