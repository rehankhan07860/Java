import java.util.Scanner;

public class celciustoforenheit {
    public static void main(String[] args) {
        System.out.println("Enter your celcious: ");
        Scanner sc = new Scanner(System.in);
        double cel;
        cel = sc.nextDouble();
        cel = cel * 1.8000 + 32.00;
        System.out.println("Farhenit is: "+cel);
    }
}
