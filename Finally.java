public class Finally {
    public static int geek(){
        try {
            int x = 12;
            int y = 6;
            int z = x/y;
            return z;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Yes this is finally");
        }
        return -1;
    }

    public static void main(String[] args) {
       int k = geek();
        System.out.println(k);
        int a = 23;
        int b = 12;
        while (true){
            try {
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally value of b: "+ b);
            }
            b--;
        }
        try {
            System.out.println(50/2);
        }
        finally {
            System.out.println("yes this is finally");
        }
    }
}
