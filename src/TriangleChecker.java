import java.util.Scanner;
public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the measure of angle 1 of triangle:");
        float angle1 = sc.nextFloat();
        System.out.println("Enter the measure of angle 2 of triangle:");
        float angle2 = sc.nextFloat();
        System.out.println("Enter the measure of angle 3 of triangle:");
        float angle3 = sc.nextFloat();
        float sum = angle1 + angle2 + angle3;

        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180) {
            System.out.println("This is a valid triangle");

            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("It is an equilateral triangle");
            } else if ((angle1 == angle2) || (angle2 == angle3) || (angle1 == angle3)) {
                System.out.println("It is an isosceles triangle");
            } else {
                System.out.println("It is a scalene triangle");
            }
        }
            else {
            System.out.println("This is an invalid triangle");
        }
        sc.close();
        }


    }



