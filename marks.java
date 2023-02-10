import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        int marks;
        System.out.println("Enter your Marks: ");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if (marks >=80  && marks<= 100){
            System.out.println("Topper");
        } else if (marks >= 60 && marks <= 80) {
            System.out.println("First Division");
        } else if (marks >= 45 && marks <=60) {
            System.out.println("Second Division");
        } else if (marks >=30 && marks <= 45) {
            System.out.println("Third Division");
        }else {
            System.out.println("Faill");
        }
    }
}
