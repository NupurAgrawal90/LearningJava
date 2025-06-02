import java.util.Scanner;


public class Nupur {

    public Nupur() {

        System.out.println("default");
    }
    public Nupur(int a , int b)
    {

        int sum = a+b;
        System.out.println("sum of the numbers is "+ sum);

    }
    public Nupur( String name)
    {

        System.out.println("Hi " +name);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
       int a = sc.nextInt();
        System.out.println("Enter next number ");
       int b = sc.nextInt();
        Nupur obj1 = new Nupur(a,b);

        System.out.println("Enter Username");
        String name = sc.next();

        Nupur ob = new Nupur(name);
    }


}