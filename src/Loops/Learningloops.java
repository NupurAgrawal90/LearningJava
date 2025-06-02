package Loops;
import java.util.Scanner;
//table creation
public class Learningloops {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to table generator.Enter the number of your choice");
        int num= sc.nextInt();

        for(int i=1; i<=10;i++)
        {
           int result = num * i;
            System.out.println(num+"*"+i+"="+result);
        }
        sc.close();
    }}


