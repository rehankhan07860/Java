import java.util.Scanner;

public class largenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2,  num3;
        System.out.println("Enter Your First Number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter Your Second Number: ");
        num2 = sc.nextDouble();
        System.out.println("Enter Your Third Number: ");
        num3 = sc.nextDouble();

      if (num1 > num2 && num1 > num3){
          System.out.println("Big Frist Number: " + num1);
      } else if (num2 > num3 && num2 > num1) {
          System.out.println("Big Second Number: "+ num2);

      }else {
          System.out.println("Third number Big: " + num3);
      }

    }
}
