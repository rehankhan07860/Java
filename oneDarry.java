public class oneDarry {
    public static void main(String[] args) {
    /* int [] marks = {3,4,5};
   int sum = 0;
   for (int subje:marks){
       sum = sum + subje;
   }
        System.out.println(sum);
*/

        int [] marks = {4,5,6,7,3,7,3,7};
        int num = 50;
        boolean isInArray = false;
        for (int elements:marks){
            if (num == elements){
                isInArray= true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in  the array");
        }else {
            System.out.println("The value is not present in the array");
        }
    }
}
