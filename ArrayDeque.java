import java.util.*;
public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> myArrayDeque = new java.util.ArrayDeque<>();
        myArrayDeque.add(34);
        myArrayDeque.add(3);
        myArrayDeque.add(345);
        myArrayDeque.add(23);
        myArrayDeque.add(65);
        myArrayDeque.add(54);
        for (int i = 0; i<myArrayDeque.size(); i++){
            System.out.println(myArrayDeque.getFirst());
            System.out.println(myArrayDeque.getLast());
            System.out.println(myArrayDeque.stream().toArray());
        }
    }
}
