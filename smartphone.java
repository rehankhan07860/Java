
    interface MyCamer{
        void takeSnap();
        void recordVideo();
        static void greet(){
            System.out.println("Good morning");
        }
        default void record4kvideo(){
            greet();
            System.out.println("Recording in 4k....");
        }
    }
    interface MyWifi{
        String[] getNetworks();
        void connectToNetwork(String network);
    }

    class MyCellPhone{
        void callNumber(int phoneNumber){
            System.out.println("Calling "+ phoneNumber);
        }
    }

    class MySmartPhone extends MyCellPhone implements MyWifi,MyCamer{
        public void takeSnap(){
            System.out.println("Taking snap");
        }
        public void recordVideo(){
            System.out.println("Taking snap");
        }
        public String[] getNetworks(){
            System.out.println("Getting List of Networks");
            String[] networkList= {"Rehan", "Gaurav", "Ezaz5g"};
            return networkList;
        }
        public void connectToNetwork(String network){
            System.out.println("Connecting to " + network);
        }
    }
    public class smartphone {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.recordVideo();
        String[] ar = ms.getNetworks();
        for (String item:ar){
            System.out.println(item);
        }
    }
}
