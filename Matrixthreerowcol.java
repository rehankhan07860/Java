public class Matrixthreerowcol {
    public static void main(String[] args) {
        int rows=3,columns=3;
        int[][] firstmatrix = { {2,3,5},{4,5,6},{7,8,9} };
        int[][] secondmatrix = { {5,9,7},{8,3,4},{9,3,6}};
        int[][] sum = new int[rows][columns];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                sum[i][j] = firstmatrix[i][j] + secondmatrix[i][j];
            }
        }
        for (int[] row: sum){
            for (int column: row){
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
