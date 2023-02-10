public class staticclass {

    static int sum(int a, int b){
        return a+b;
    }
    static  int addition(int x, int y, int z){
        return x+y+z;
    }
    static int mul(int ...arr){
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(addition(4,5,2));
        System.out.println(mul(3,2,5,5));

    }
}
