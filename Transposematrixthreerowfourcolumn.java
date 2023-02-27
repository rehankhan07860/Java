public class Transposematrixthreerowfourcolumn {
    public static void main(String[] args) {
        int rows = 3, columns =4;
        int[][] matrix= { {5,6,7,9},{4,8,3,4},{7,6,5,9}};
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int[] row : transpose){
            for (int column : row){
                System.out.print(column + "   ");
            }
            System.out.println();
        }
    }
}
