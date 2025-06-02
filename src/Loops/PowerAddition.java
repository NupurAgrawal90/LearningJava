package Loops;
import java.util.Scanner;
public class PowerAddition {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the range 'n' where to want to stop");
        int n = sc.nextInt();
        int a=1;


        for (int i=1;i<=n;i++)
        {
            System.out.println(a+" + "+a+" = "+(a+a));
            a= a + a;
        }
    }
}
