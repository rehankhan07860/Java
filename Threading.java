class mythreading extends Thread{
    public void run(){
        int i = 0;
        while (i<500) {
            System.out.println("Cooking is Running...");
            System.out.println("I am Happy");
        }
    }

    static class mythreading2 extends Thread{
        public void cheating(){
            int i = 0;
            while (i<500){
                System.out.println("Cheatting to my GF");
                System.out.println("I am not happy");
            }
        }
    }
    static class mythreading3 extends Thread{
        public void study(){
            int i = 0;
            while (i<500){
                System.out.println("I am going to Study");
                System.out.println("I am happy");
            }
        }
    }
}





public class Threading {
    public static void main(String[] args) {
     mythreading m = new mythreading();
     mythreading.mythreading2 s = new mythreading.mythreading2();
     mythreading.mythreading3 r = new mythreading.mythreading3();
     m.start();
     s.start();
     r.start();
    }
}
