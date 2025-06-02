import java.sql.SQLOutput;
import java.util.Scanner;

public class Grading
{
    public static void main(String[] args)
    {
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = grade.nextLine();
        System.out.println("hi "+name);
        System.out.println("Enter your marks");
      Float marks = grade.nextFloat();

      if (marks<0 || marks>100)
      {
          System.out.println("Enter marks between 0 and 100");
      }
      else if (marks<35)
        {
            System.out.println("Sorry , you have failed the exams ");
        }
        else if(marks>=35 && marks<60 )
        {
            System.out.println("your grade is C");
        }
        else if (marks>=60 && marks<70)
            {
                System.out.println("your grade is B");
            }
            else if(marks>=70 && marks<90)
            {
                System.out.println("your grade is A");
            }
            else if( marks>=90 && marks<100)
            {
                System.out.println("congratulations!! you have scored an A+");
            }
            else
            {
                    System.out.println("you have scored centum, congratulations");
                }

        }

    }


