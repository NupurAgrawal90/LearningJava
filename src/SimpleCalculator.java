
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter an operator (+,-,*,/):");
        char operator = sc.next().charAt(0);
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("number cannot be divided by zero");
                } else {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                }
                break;
            default:
                System.out.println("Enter a valid operator from (+,-,*,/)");
        }
        sc.close();
        }

}

