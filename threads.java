class thrd1 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good Morning");
        }

    }
}
class thrd2 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Welcome");
        }

    }
}
public class threads {
    public static void main(String[] args) {
   thrd1 th = new thrd1();
   thrd2 th1 = new thrd2();
   th.start();
   th1.start();
    }
}
