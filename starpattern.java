public class starpattern {
static void star(int n){
    for (int i = 0; i<n; i++){
        for (int j = 0; j<i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
static void pattern(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i+1); j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {


     star(10);

        pattern(5);

    }
}
