public class MatrixSubthreerowcol {
    public static void main(String[] args) {
        int rows = 3, columns = 3;
        int[][] firstmatrix = { {2,3,4},{3,4,6},{4,6,8}};
        int[][] secondmatrix = { {5,6,8},{45,6,8},{4,7,9}};
        int[][] subtraciton = new int[rows][columns];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                subtraciton[i][j] = firstmatrix[i][j] - secondmatrix[i][j];
            }
        }
        for (int[] row : subtraciton){
            for (int column : row){
                System.out.print(column + "     ");
            }
            System.out.println();
        }
    }
}
