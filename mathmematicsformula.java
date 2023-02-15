import java.util.Scanner;

class formula{
    int radius;
    public double area(){
        return Math.PI * radius * radius;
    }
}
public class mathmematicsformula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice Radiuos: ");
        double ra;
        ra = sc.nextDouble();
        System.out.println(ra);
        formula f = new formula();
        f.radius=3;
        System.out.println(f.radius);

    }
}
