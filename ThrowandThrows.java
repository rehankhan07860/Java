class NegativeRadiusException extends Throwable {
    @Override
    public String toString() {
        return "Radius can't be negative";
    }
    public String getMessage(){
        return "Radius can't be negative";
    }
}

public class ThrowandThrows {
    public static double area(int r) throws NegativeRadiusException{
       if (r<0){
           throw new NegativeRadiusException();
       }
       double result = Math.PI * r * r;
       return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            double arr = area(6);
            System.out.println(arr);
        }
        catch (Exception | NegativeRadiusException e){
            boolean Exception;
            System.out.println(e);
        }


    }
}
