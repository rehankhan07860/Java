import javafx.scene.transform.Scale;

import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice table: ");
        int num;
        num = sc.nextInt();
        for (int i = 1; i<=10; i++){

            System.out.println(num +" * " + i  + "= " +(num * i) );
        }
    }
}
