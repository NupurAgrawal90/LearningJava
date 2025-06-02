import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float number = sc.nextFloat();
        if(number<0)
        {
            System.out.println(number+ " is a negative number");
    }
        else if (number>0) {
            System.out.println(number + " is a positive number");
        }
        else {
            System.out.println(number+ " is neither positive nor negative");
        }
        sc.close();
        }

    }

