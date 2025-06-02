
import java.util.Scanner;

public class Nestedif
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to YOUR bank");
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your income ");
        float income = sc.nextFloat();

        if (age >= 18 && age<=60 ) {
            if (income >30000) {
                System.out.println("you are eligible for loan");
            } else {
                System.out.println("you are not eligible for loan due to low income");
            }
        }
    else
        {
        System.out.println("you are not eligible for loan due to age constraint");
    }
    sc.close();

    }

}
