public class dynamicmethoddispatch {

    static class A{
        public void phone(){
            System.out.println("This is Simple phone");
        }
        public void green(){
            System.out.println("This is method2");
        }
    }
    class B extends A{
        public void SmartPhone(){
            System.out.println("This is smart phone");
        }
        public void red(){
            System.out.println("This is method3");
        }
    }

    public static void main(String[] args) {
     A a = new A();
      a.green();
      a.phone();


    }
}
