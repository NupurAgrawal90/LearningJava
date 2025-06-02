
import java.util.Scanner;
public class Temperature {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in your area in Celsius");
        float temp = sc.nextFloat();

       if(temp>0) {
           if (temp < 15) {
               System.out.println("It is cold");

           } else if (temp <= 30) {
               System.out.println("It is warm");

           } else if (temp <44) {
               System.out.println("It is hot");
           }
           else
           {
               System.out.println("It is boiling");
           }
       }
       else
           {
               System.out.println("It is freezing");
           }


       sc.close();


    }
}
