interface sampleinterface{
    void meth1();
    void meth2();
}
interface childinterface extends sampleinterface{
    void meth3();
    void meth4();
}

class mysamplecalass implements childinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}


public class inheritance {
    public static void main(String[] args) {
        mysamplecalass mycs  = new mysamplecalass();
        mycs.meth1();
        mycs.meth2();
        mycs.meth3();
        mycs.meth4();

    }
}
