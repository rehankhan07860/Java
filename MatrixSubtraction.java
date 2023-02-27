public class MatrixSubtraction {
    public static void main(String[] args) {
        int rows = 2, columns = 2;
        int[][] firstmatrix = { {1,3},{4,5}};
        int[][] secondmatrix = { {5, 5},{4,2}};
        int[][] sub = new int[rows][columns];
        for (int i = 0; i<rows; i++){
            for (int j=0; j<columns; j++){
                sub[i][j] = firstmatrix[i][j] - secondmatrix[i][j];
            }
        }
        for (int[] row : sub){
            for (int column : row){
                System.out.print(column + "   ");
            }
            System.out.println();
        }
    }
}
