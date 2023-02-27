public class MatrixMultiplication {
    public static void main(String[] args) {
        int r1 = 2, c1 = 2;
        int r2 = 2, c2 = 2;
        int[][] firstmatrix = { {5, 6}, { 7, 3}};
        int[][] secondmatrix = { {4, 3}, {2, 5}};
        int[][] product = new int[r1][c1];
        for (int i = 0; i<r1; i++){
            for (int j = 0; j<c2; j++){
                for (int k = 0; k<c1; k++){
                    product[i][j] += firstmatrix[i][k] * secondmatrix[k][j];
                }
            }
        }
        for (int[] row : product){
            for (int  column : row){
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
