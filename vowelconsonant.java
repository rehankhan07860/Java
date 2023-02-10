import java.util.Scanner;

public class vowelconsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter Your Choice character: ");
        char ch = 'a';
      // ch = sc.nextChar();
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("This is Vowel: " + ch);
        } else {
            System.out.println("This is Consonant: " + ch);
        }
    }
}
