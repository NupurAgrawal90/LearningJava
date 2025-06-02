import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the day");
        String day= scan.nextLine().toLowerCase();
        switch (day)
        {
            case "friday":
                System.out.println("relax! it's almost weekend");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Hurray!!!! it's THE WEEKEND ");
                break;
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
                System.out.println("its midweek");
                break;
            default:
                System.out.println("Enter valid name of the day");
        }




    }
}
