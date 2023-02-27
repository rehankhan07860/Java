public class SimpleMatrix {
    public static void main(String[] args) {
        int rows = 2, columns = 2;
        int[][] firstmatrix = {{5, 7}, {4, 6}};
        int[][] secondmatrix = {{3, 9},{8,7}};
        int[][] sum = new int[rows][columns];
        for (int i =0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                sum[i][j] = firstmatrix[i][j] + secondmatrix[i][j];
            }
        }
        for (int[] row: sum){
            for (int column: row){
                System.out.printf(column + "  ");
            }
            System.out.println();
        }
    }
}
