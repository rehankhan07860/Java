import java.util.Scanner;

public class floatinnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first floating number: ");
        float a, b, c;
        a = sc.nextFloat();
        System.out.println("Enter your second floating number: ");
        b = sc.nextFloat();
        c = a + b;
        System.out.println("Add float Number is: " +c);
    }
}
