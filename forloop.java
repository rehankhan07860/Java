public class forloop {
    public static void main(String[] args) {
        int x,y;
        for (x = 1; x<=10; x++){
            for (y = 1; y<x; y++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
