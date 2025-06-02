import java.util.Scanner;
public class ElectricityBillCal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the consumed units");
        int units = sc.nextInt();
        double bill;

        if(units>0)
        {
            if(units<=100) {
                bill = 1.5 * units;
                //System.out.println("Your total bill is " + bill + " rs");
            } else if(units<=300)
            {
                bill=  2* units;
               // System.out.println("Your total bill is " + bill + " rs");
            }
            else {
                bill = 3 * units;
            }
            System.out.println("Your total bill is " + bill + " rs");


            } else {
            System.out.println("Enter valid units consumed");
        }
        sc.close();

        }


    }


