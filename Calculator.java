import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    /* char operator;
      double num1, num2, result;
      Scanner sc = new Scanner(System.in);
        System.out.println("Choose operator: +, -, *, /");
        operator = sc.next().charAt(0);
        System.out.println("Enter your First Number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter your Second Number: ");
        num2 = sc.nextDouble();
        switch (operator){
            case '=':
                result = num1 + num2;
                System.out.println("Addition:- " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction:- " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication:- " + result);
                break;
            case  '/':
                result = num1 / num2;
                System.out.println("Division:- " + result);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
        sc.close();*/

       char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();

    }
}
