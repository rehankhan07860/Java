import javax.swing.table.TableRowSorter;

class myrunnable extends Runnable {
    public void run(){
        System.out.println("I am Runnable...");
    }
}
class myrunnable1 extends Runnable {
    public void run(){
        System.out.println("I am stand the way..");
    }

}

public class Runnable {
    public static void main(String[] args) {
        myrunnable1 r1 = new myrunnable1();
        Thread gun = new Thread((java.lang.Runnable) r1);
        myrunnable r2 = new myrunnable();
        Thread goli = new Thread((java.lang.Runnable) r2);
        gun.start();
        goli.start();

    }
}
