import java.sql.SQLOutput;
import  java.util.Scanner;
public class comparison {

    public static void main(String[] args) {
        Scanner compare = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = compare.nextInt();
        System.out.println("Enter second number");
        int b = compare.nextInt();
        System.out.println("Enter third number");
        int c = compare.nextInt();

//        if (a > b) {
//            if (a > c) {
//                System.out.println(a + " is the greatest number");
//            } else {
//                System.out.println(c + " is the greatest number");
//            }
//        } else if (b > c) {
//            System.out.println(b + " is the largest number");
//        } else {
//            System.out.println(c + " is the largest number");
//        }
//  }

       int max = (a > b) ? ((a > c) ? a : c) :( (b > c) ? b : c);
        System.out.println("maximum of all the numbers is " + max);
    }
}

