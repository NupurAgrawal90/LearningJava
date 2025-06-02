package Loops;
import java.util.Scanner;
public class LearnLoops {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    boolean vision= false;

    while(!vision)
    {
        System.out.println("are you able to see now?");
        vision = sc.nextBoolean();
    }
        System.out.println("Now that is perfect. I am glad you can see now.");


//      int i=1;
//      while(i%20 !=0)
//      {
//          System.out.println(i);
//          i++;
//      }



    }
}
