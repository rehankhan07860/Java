import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        int num1, num2,num3, choice;
        System.out.println("Enter two number: ");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("Enter your choice number: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
               num3 = num1 + num2;
                System.out.println("Addition two no is: "+num3);
                break;
            case 2:
                num3 = num1 - num2;
                System.out.println("Subtraction two no is: "+num3);
                break;
            case 3:
                num3 = num1 * num2;
                System.out.println("Multiplication two no is: "+num3);
                break;
            case 4:
                num3 = num1 / num2;
                System.out.println("Division two no is: "+num3);
                break;
            case 5:
                num3 = num1 % num2;
                System.out.println("Modulus two no is: "+num3);
                break;
        }
    }
}
