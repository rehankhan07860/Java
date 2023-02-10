import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int year;
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0){
            System.out.println("It is Leap Year: " + year);

        }else {
            System.out.println("It is not Leap Year: " + year);
        }
    }
}
