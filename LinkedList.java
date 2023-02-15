import java.util.*;
public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> myLinkedlist = new java.util.LinkedList<>();
        myLinkedlist.add(23);
        myLinkedlist.add(34);
        myLinkedlist.add(54);
        myLinkedlist.add(24);
        myLinkedlist.add(64);
        myLinkedlist.add(9);
        myLinkedlist.set(2,534);
        System.out.println(myLinkedlist.indexOf(534));
        System.out.println(myLinkedlist.lastIndexOf(9));
        for (int i = 0; i<myLinkedlist.size(); i++){
            System.out.print(myLinkedlist.get(i) + " ");
        }
    }
}
