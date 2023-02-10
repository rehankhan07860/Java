
class mypriority extends Thread{
    public mypriority(String name){
        super(name);
    }
    public void run(){
        int i = 20;
        while (true){
            System.out.println("Thank Your.." + getId());
            System.out.println("Welcome.." + getName());
        }
    }
}
public class Priroty {
    public static void main(String[] args) {
    mypriority mypriority1 = new mypriority("Rehan Khan");
    mypriority mypriority2 = new mypriority("Farhan Khan");
    mypriority mypriority3 = new mypriority("Siran Khan");
    mypriority mypriority4 = new mypriority("Kamran Khan");
    mypriority mypriority5 = new mypriority("Akib khan");
    mypriority mypriority6 = new mypriority("Roj Khan");
    mypriority1.setPriority(Thread.MAX_PRIORITY);
    mypriority2.setPriority(Thread.MIN_PRIORITY);
    mypriority3.setPriority(Thread.MIN_PRIORITY);
    mypriority4.setPriority(Thread.MIN_PRIORITY);
    mypriority5.setPriority(Thread.MIN_PRIORITY);
    mypriority6.setPriority(Thread.MIN_PRIORITY);
    mypriority1.start();
    mypriority2.start();
    mypriority3.start();
    mypriority4.start();
    mypriority5.start();
    mypriority6.start();
    }
}
