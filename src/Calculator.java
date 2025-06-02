public class Calculator
{
    int a = 5 ;
    int b =6;

    public void  add()
    {
        int sum = a+b;
        System.out.println("sum is "+sum);
    }
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        cal.add();

    }


}

