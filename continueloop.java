public class continueloop {
    public static void main(String[] args) {
        int num;
        for (num = 1; num<=10; num++){
            if (num == 5){
                continue;
            }
            System.out.println(num);
        }
    }
}
