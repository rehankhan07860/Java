import java.util.Scanner;

public class cgpa {
    public static void main(String[] args){
        System.out.println("Enter Your Marks: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Math Marks: ");
        float math= sc.nextFloat();
        System.out.println("Enter your Physics marks: ");
        float Phy= sc.nextFloat();
        System.out.println("Enter your Chemistry marks: ");
        float che = sc.nextFloat();
        float cgp= (math+ Phy + che)/30;
        System.out.println("CGP is: " +cgp);
    }
}
