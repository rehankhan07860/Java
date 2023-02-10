public class phone {


    static class cellphone{
        public void call(){
            System.out.println("Calling...");
        }
        public void vaibrate(){
            System.out.println("Vaibrating...");
        }
        public void silent(){
            System.out.println("Silent....");
        }
    }
    public static void main(String[] args) {

        cellphone redmi =  new cellphone();
        redmi.call();
        redmi.vaibrate();
        redmi.silent();

    }
}
