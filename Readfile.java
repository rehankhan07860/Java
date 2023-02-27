import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile
{
    public static void main(String[] args) {
        File myreadfile = new File("rehan.txt");
        try {
            Scanner sc = new Scanner(myreadfile);
            while (sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
