public class labledbreak {
    public static void main(String[] args) {
        for (int x = 1; x<=5; x++){
            for (int y = 1; y<=5; y++){
                if (y ==3){
                    break;
                }
                System.out.println(x + "  " + y);
            }
        }
    }
}
