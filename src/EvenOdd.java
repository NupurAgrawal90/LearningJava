import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num = sc.nextInt();
        String type = (num%2 ==0)? "even": "odd";

        //if else condition to declare positive negative

        if(num>0) {
            System.out.println(num + " is a positive " + type+" number");
        }
        else if(num<0) {
            System.out.println(num+ " is a negative "+ type+" number");
        }else {
            System.out.println(num + " is neither negative nor positive");
        }




//        if (num > 0) {
//            if (num % 2 == 0) {
//                System.out.println(num + " is a positive even number");
//            } else {
//                System.out.println(num + "is a positive odd number");
//            }
//        } else if (num < 0) {
//            if (num % 2 == 0) {
//                System.out.println(num + " is a negative even number");
//            } else {
//            System.out.println(num + " is a negative odd number");
//        }
//           } else {
//                System.out.println(num+ " is neither negative nor positive , it is zero");
//        }
        sc.close();



    }

}



