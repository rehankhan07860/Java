public class OctaltoBinary {
    public static void main(String[] args) {
        int octal = 67;
        long binary = convertOctalToBinary(octal);
        System.out.println(octal + " in octal = " + binary + " in binary");
    }

    public static long convertOctalToBinary(int octalNumber) {
        int decimalNumber = 0, i = 0;
        long binaryNumber = 0;

        while (octalNumber != 0) {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }

        return binaryNumber;
    }
}
