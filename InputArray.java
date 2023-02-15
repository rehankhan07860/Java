import java.util.Scanner;

public class InputArray {
    public static void main(String[] args){
        int a[] = new int[5];
        System.out.println("Enter array Elements: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            a[i] = sc.nextInt();


            }
            Array.sort(a);
            System.out.println("\n Array Elements");
            for (int b : a){
                System.out.print(b+" ");
            }
        }

    }

