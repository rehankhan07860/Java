public class twoDarray {
    public static void main(String[] args) {
        int [][] mt1= {{2,3,5,6},{6,7,8,9}};
        int [][] mt2 = {{3,5,6,7},{4,5,6,7}};
        int [][] result= {{0,0,0,0},{0,0,0,0}};

        for (int i = 0; i<mt1.length;i++){
            for (int j = 0; j<mt1[i].length; j++){
                result[i][j] = mt1[i][j] + mt2[i][j];
                System.out.print(result[i][j]+ "  ");

            }
            System.out.println(" ");
        }
    }
}
