public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 371, originaNumber, remainder, result=0;
        originaNumber = number;
        while (originaNumber != 0){
            remainder = originaNumber % 10;
            remainder += Math.pow(remainder, 3);
            originaNumber /= 10;
        }
        if (result == number){
            System.out.println(number + " is an Armstrong Number");

        }else {
            System.out.println(number + " is not an Armstrong  Number");
        }

    }
}
