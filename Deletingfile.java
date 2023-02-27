import java.io.File;
import java.lang.reflect.Field;

public class Deletingfile {
    public static void main(String[] args) {
        File myfile = new File("rehan.txt");
        if (myfile.delete()){
            System.out.println("Complete Deleted");
        }else {
            System.out.println("some Error...");
        }
    }
}
