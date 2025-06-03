package nupurlearning.com;

public class Conversion {

   public static void main(String[] args) {
       int a = 12;
       float b = a;//implicit conversion (small int to big float)
       float c = 13.45f;
       int d = (int )c;// explicit conversion(big float to small int)
       System.out.println("value of b is "+b);
       System.out.println("value of d is "+d);

   }
}
