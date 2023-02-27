public class TransposeMatrix {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] matrix = { {2,3,4}, {5,6,7}};
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int[] row : transpose){
            for (int column : row){
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
