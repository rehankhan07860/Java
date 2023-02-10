import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("Enter your total marks: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Maths marks: ");
        int math = sc.nextInt();
        System.out.println("Enter your Physics marks: ");
        int phy = sc.nextInt();
        System.out.println("Enter your Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.println("Enter your English marks: ");
        int eng= sc.nextInt();
        System.out.println("Enter your Urdu marks: ");
        int urdu = sc.nextInt();
        float totla_Marks= ((math + phy + chem + eng + urdu)/500.0f)*100;
        System.out.println("Your Percentage is: " +totla_Marks);
    }
}
