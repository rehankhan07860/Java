public class interfaceuse {

    interface Animal{
        default void say(){
            System.out.println("Hello, This is default method:");
        }
        void bark();
    }

    public static class cwh implements Animal{
        public void bark(){
            System.out.println("Dog bark");

        }
    }

    public static void main(String[] args) {

        cwh mycwh = new cwh();
        mycwh.bark();
        mycwh.say();

    }
}
