package Loops;
import java.util.Scanner;

public class Addnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int range = sc.nextInt();

        //print squares of n numbers
        for (int i = 1; i <= range; i++) {
            System.out.println("square of "+i+ " is = "+(i * i));
        }
//        int sum = 0;
//    //print all even numbers
//        System.out.println("list of all even numbers ");
//        for(int i=1; i<=range;i++)
//        {
//            System.out.println(2*i);
//        }
//    }
        //sum of n even numbers
//        for(int i =1;i<=range;i++)
//        { sum= sum+2*i;
//        }
//        System.out.println("sum of n even numbers is "+sum);
//    }


//sum of n natural numbers
//        for (int i = 1; i <= range; i++) {
//
//            System.out.println(i+" + "+sum+ " = "+(i+sum) );
//            sum = i + sum;
//        }
//            System.out.println("Sum of first "+range+ " natural numbers is = "+sum);
//        }
    }
}


