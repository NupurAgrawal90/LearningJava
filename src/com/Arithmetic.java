package com;
import java.util.Scanner;

public class Arithmetic {
    public int add(int a ,int b,int c)
    {
        int d;
        d= a+b;
        int e ;
        e = d+c;
        System.out.println("result of sum is "+e);
        return e;
    }
    public int sub(int e ,int f)
    {
        int g;
        g= e- f;
        System.out.println("result of sub is "+g);
        return g;
    }
    public int mult(int g , int h )
    {
        int i ;
        i = g*h;
        System.out.println("result of mult is "+i);
        return i;
    }
    public float div(int i , int j) {
        float k;
        k = (float) i / j;
        System.out.println("result of div is " + k);
        return k;
    }
    public static void main(String[] args) {
        Arithmetic A1 = new Arithmetic();
       A1.div(A1.mult(A1.sub( A1.add(10, 2, 2), 2), 2), 2);

//             Scanner sc = new Scanner(System.in);
//
//
//
//
//             System.out.println("Enter the first number");
//             int firstNumber= sc.nextInt();
//             System.out.println("Enter the second number");
//             int secondNumber= sc.nextInt();
//             int result = firstNumber + secondNumber;
//             System.out.println("Sum of these numbers = "+result);
//

//             System.out.println("Enter a number");
//             int w = sc.nextInt();
//             int z = w*w;
//             System.out.println("Square of the number " +w+" is "+z);
    }

}
