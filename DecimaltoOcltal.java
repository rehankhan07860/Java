public class DecimaltoOcltal {
    public static void main(String[] args) {
        int decimal = 78;
        int octal = convertDecimaltoOctal(decimal);
        System.out.printf("%d in decimal = %d ",decimal,octal);
    }

    public static int convertDecimaltoOctal(int decimal) {
        int octalnumber=0,i = 1;
        while (decimal != 0){
            octalnumber +=(decimal % 8)*i;
            decimal /= 8;
            i *= 10;
        }
        return octalnumber;
    }
}
