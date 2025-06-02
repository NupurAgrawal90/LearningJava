package Loops;
import java.util.Scanner;

public class NumberReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int reverse = 0;
        System.out.println("Enter a number ");
        number = sc.nextInt();
        int original = number;

        for (; number != 0; number = number / 10) {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;

        }
        System.out.println("Reversed number: " + reverse);
        if (original == reverse) {
            System.out.println("its a palindrome");
        }
    }
}

