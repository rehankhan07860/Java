public class fibonaciseies {

    static int fib(int n){
        if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        else {
           return fib(n - 1) + fib(n - 2);

        }
    }

    public static void main(String[] args) {
        int result = fib(5);
        System.out.println(result);
    }
}
