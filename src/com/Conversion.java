package com;

public class Conversion {
    public static void main(String[] args) {
        int a= 34;//smaller than float
        float b;//bigger than int
        b= a;
        float c= 12.5f;// need to put f
        int d = (int) c;//explicit conversion
        //smaller basket cannot hold bigger basket

        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
        System.out.println("value of d is "+d);
        System.out.println("value of c is "+c);
        //implicit conversion as a bigger basket can hold a smaller basket
    }
}
