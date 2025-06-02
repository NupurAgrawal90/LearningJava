import java.util.Scanner;

public class ifElseifElse
{
        public static void main(String[] args)
    {

    Scanner sc= new Scanner(System.in);

        System.out.println("enter your name");
        String name= sc.next();
        System.out.println("hi "+name);

        System.out.println("enter your age");
        Float age = sc.nextFloat();
        if (age>0 && age<=3)
        {
            System.out.println("you are a toddler");

    } else if(age>3 && age<=5)
        {
            System.out.println("you are a preschooler");
        }

    else if (age>5 && age<=12)
    {
        System.out.println("you are a school going child");
    }
    else if (age>12 && age<18) {
            System.out.println("you are a teenager");
        }
    else
    {
        System.out.println("congratulations!! you are an adult now and you can cast vote");
    }

    }
}
