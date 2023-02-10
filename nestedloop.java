public class nestedloop {
    public static void main(String[] args) {
        int x = 1;
        int y;
        while (x <=10){
            y = 1;
            System.out.print(y + " ");
            while (y < x){
                y++;
                System.out.print(y + " ");
            }
            ++x;
            System.out.print("\n");

        }

    }
}
