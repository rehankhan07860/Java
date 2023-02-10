public class maxarr {
    public static void main(String[] args) {
        int [] arr = {200,4,5,23,54,66,77};
        int max = 0;
        for (int e:arr){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The max value is: " +max);
    }
}
