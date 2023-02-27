import static java.lang.Math.pow;

public class Power {
    public static void main(String[] args) {
        int base=3,pow=4;
        int result = power(base,pow);
        System.out.println(base + "^" + pow + "=" + result);
    }
    public static int power(int base, int pow){
        if (pow != 0){
            return (int) (base * pow(base,pow-1));
        }else {
            return 1;
        }
    }
}
