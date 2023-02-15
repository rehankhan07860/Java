import java.util.Scanner;

public class Exceptionshandle {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 50;
        marks[1] = 45;
        marks[2] = 54;
        marks[3] = 89;
        marks[4] = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your index position: ");
        int ind = scanner.nextInt();
        System.out.println("Enter your choice you want to divide any number: ");
        int number = scanner.nextInt();
        try {
            System.out.println("Your marks is: " + marks[ind]);
            System.out.println("Your number is: "+ marks[ind]/number);
        }
        catch (Exception e){
            System.out.println("No result availaible this type question erro ");
            System.out.println(e);
        }



    }
}
