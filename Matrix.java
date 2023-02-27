public class Matrix {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {1,2,3}, {4,5,6} };
        int[][] secondMatrix = { {7,8,9}, {4,2,5} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
            }
        }


