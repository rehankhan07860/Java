import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        File myfile = new File("rehan.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
