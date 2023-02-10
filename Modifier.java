class c1{
    public int x =5;
    private int y = 3;
    protected  int z = 54;
    int a  = 23;
    public void method(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Modifier {
    public static void main(String[] args) {
     c1 c = new c1();
     c.method();
    }
}
