public class ArrayAverage {
    public static void main(String[] args) {
        double[] numarray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0;
        for (double ave:numarray){
            sum +=ave;
        }
        double average = sum / numarray.length;
        System.out.printf("Average:- "+ average);
    }
}
