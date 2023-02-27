import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice year: ");
        int year;
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("This is Leap Year: " + year);

        }else {
            System.out.println("This is not Leap year: " + year);
        }
    }
}
