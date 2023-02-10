import java.util.Random;
import java.util.Scanner;

public class firstgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for paper,3 for scissor");
        int userInput = sc.nextInt();
      Random random = new Random(3);
      int computerInput = random.nextInt();
      if (userInput == computerInput){
          System.out.println("Draw match");
      } else if (userInput==0 && computerInput==2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
          System.out.println("You Win the match");
          
      }else {
          System.out.println("Computer win tha match");
      }
        System.out.println("Computer choice: "+ computerInput);
    }
}
