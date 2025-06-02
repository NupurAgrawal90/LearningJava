package com;

public class calculator {

    public int sum(int a, int b )
    {
        int c;
        c= a+b;
        System.out.println("the result of sum is "+c);
        return c;
    }
    public int sub(int d ,int e)
    {
        int f;
        f= d-e;
        System.out.println("the result of difference is "+f);
        return f ;
    }
    public int mult(int c, int f)
    {
        int g;
        g= c*f;
        System.out.println("The final output of the expression is "+g);
        return g;
    }
    public static void main(String[] args)
    {
        calculator c1 = new calculator();
        int sumresult=c1.sum(20,13);
        int subresult= c1.sub(10,9);
        c1.mult(sumresult,subresult);
    }
}
