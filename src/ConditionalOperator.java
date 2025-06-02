import java.util.Scanner;

public class ConditionalOperator {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in 24 hour format");
        float time = sc.nextFloat();
        if (time>=0 && time<=24)
        {
            if (time>= 10 && time <=20)
            {
                System.out.println("office is open");
            }
            else
                System.out.println("office is closed");
        }
        else
            System.out.println("Enter valid time");



//        if( time<0  ||time>24 )

//        {
//            System.out.println("INVALID TIME ");
//        }
//        else if(time>=11 && time<=20)
//        {
//            System.out.println("office is open");
//        }
//        else
//        {
//            System.out.println("office is CLOSED");
//        }




    }
}
