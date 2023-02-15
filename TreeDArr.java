import java.util.Scanner;

public class TreeDArr {
    public static void main(String[] args) {
        int arr[][][] = new int[3][3][3];
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <3; i++){
            for (int j = 0; j<3; j++){
                for (int k = 0; k<3; k++){
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }
        System.out.println("\n 3D Matrix in Array:");
        for (int i = 0; i <3; i++){
            for (int j = 0; j<3; j++){
                for (int k = 0; k<3; k++){
                    System.out.print(arr[i][j][k]+ "   ");
                }
                System.out.println();
            }
        }
    }
}
