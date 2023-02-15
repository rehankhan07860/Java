import java.util.Scanner;

class mycustom extends Exception{
    @Override
    public String toString() {
        return "I am to String";
    }

    @Override
    public String getMessage() {
        return "I am getting message";
    }
}


public class CustomExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice Digt: ");
       int x ;
       x = sc.nextInt();

        if (x < 10){
            try {
                throw new Exception("This is an Exceptions");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());

            }
        }
    }
}
