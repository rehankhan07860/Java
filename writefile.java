import java.io.FileWriter;
import java.io.IOException;

public class writefile {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("rehan.txt ");
            fileWriter.write("I am Khan Bhai");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
