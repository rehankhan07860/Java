import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        char ch = 'a';
        if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'z')){
            System.out.println("This is an Alphabet: " + ch);
        }else {
            System.out.println("This is not an Alphabet: " + ch);
        }
    }
}
