import java.util.Scanner;

public class Matrixfourrowcol {
    public static void main(String[] args) {
        int rows = 4, columns = 4;
        int[][] firstmatrix = { {1,2,3,9},{4,5,6,9},{7,8,9,9},{9,8,7,9}};
        int[][] secondmatrix = { {9,8,7,6},{5,4,3,2},{1,9,8,7},{6,5,4,3}};
        int[][] sum = new int[rows][columns];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                sum[i][j] = firstmatrix[i][j] + secondmatrix[i][j];
            }
        }
        for (int[] row : sum){
            for (int column : row){
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
