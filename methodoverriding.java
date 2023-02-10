public class methodoverriding {
  static class A{
      int a;
      public int method1(){
          return 4;
      }
      public void method2(){
          System.out.println("I am method 2 of class A");
      }
  }
  static class B extends A{
      public void method3(){
          System.out.println("I am method 3 of class B");
      }
  }
    public static void main(String[] args) {

      methodoverriding mymethod = new methodoverriding();
      A a = new A();
      a.method2();

      B b = new B();
      b.method3();


    }
}
