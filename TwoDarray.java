import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args){
        int arr[][] = new int[2][6];
        System.out.println("Enter your Number: \n");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<2; i++){
            for (int j = 0; j<6; j++){
             arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatrix Elements:");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<6; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
