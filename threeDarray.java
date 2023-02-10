import java.util.Scanner;

public class threeDarray {
    public static void main(String[] args){
        int a[][][] = new int[5][5][5];
        System.out.println("Enter your Array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                for (int k = 0; k<5; k++){
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("\n Array is: ");
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                for (int k = 0; k<5; k++){
                    System.out.print(a[i][j][k]+ "  ");
                }
                System.out.println();
            }
        }
    }
}
