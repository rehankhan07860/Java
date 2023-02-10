public class sortedarray {
    public static void main(String[] args) {
        boolean isSorted = true;
        int [] arr = {3,4,52,6,58,78};
        for (int i=0; i<arr.length; i++){
           if (arr[i] > arr[i + 1]){
               isSorted = false;
               break;

           }


        }
        if (isSorted){
            System.out.println("The array is sorted");
        }else {
            System.out.println("The array is not sorted");
        }
    }
}
