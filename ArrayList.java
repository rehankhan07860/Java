import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> mylist = new java.util.ArrayList<>();
        mylist.add(23);
        mylist.add(45);
        mylist.add(453);
        mylist.add(32);
        mylist.add(64);
        mylist.add(34);
        mylist.set(3,450);
        System.out.println(mylist.indexOf(45));
        System.out.println(mylist.lastIndexOf(34));
        for (int i = 0; i<mylist.size(); i++){
            System.out.print(mylist.get(i) + " ");

        }


    }
}
