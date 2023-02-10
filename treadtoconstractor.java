class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i = 20;
        System.out.println("Thank You!");
    }
}
public class treadtoconstractor {
    public static void main(String[] args) {
mythr mythr1 = new mythr("Rehan Khan");
mythr mythr2 = new mythr("Siran Khan");
mythr1.start();
mythr2.start();
        System.out.println(mythr1.getId());
        System.out.println(mythr1.getName());
        System.out.println(mythr2.getId());
        System.out.println(mythr2.getName());
    }
}
