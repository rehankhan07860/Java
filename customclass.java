public class customclass {

    static class custom{
        int  id;
        String name;
        public void methods(){
            System.out.println("my id is: "+id);
            System.out.println("my name is: " + name);
        }
    }

    public static void main(String[] args) {

        custom rehan = new custom();
        rehan.id=4;
        rehan.name="Khan";
       // System.out.println(rehan.id);
      //  System.out.println(rehan.name);
        rehan.methods();

    }
}
