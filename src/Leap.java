import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year to check if it is  a leap year");
        int year = scan.nextInt();
        if (year > 0) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
        else
        {
            System.out.println("enter a valid year(positive integer).");

        }
        if (year % 100 == 0) {
            System.out.println(year + " is a century year");
        }
        scan.close();
    }
    }







