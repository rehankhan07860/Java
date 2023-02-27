import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choice First Number: ");
        double num1;
        num1 = sc.nextDouble();
        System.out.println("Enter Your Choice Second Number: ");
        double num2;
        num2 = sc.nextDouble();
        System.out.println("Enter Your Choice Third Number: ");
        double num3;
        num3 = sc.nextDouble();
       if (num1 > num2 && num2 > num3){
           System.out.println("First Number is Bigest: " + num1);
       } else if (num2 > num1 && num2 > num3) {
           System.out.println("Second Number is Bigest: " + num2);
       }else {
           System.out.println("Third Number is Bigest: " + num3);
       }
    }
}
