import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> myHashset = new HashSet<>(2, 43.f);
        myHashset.add(32);
        myHashset.add(53);
        myHashset.add(34);
        myHashset.add(345);
        myHashset.add(4543);
        System.out.println(myHashset);
    }
}
