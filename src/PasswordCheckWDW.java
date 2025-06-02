import java.util.Scanner;
public class PasswordCheckWDW {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           // String password = ""; // 🔹 Initialize before the loop
            String password;
            do{
                System.out.println( "Enter your password");
                password = sc.nextLine();
            }while (!password.equals("admin123")) ;




            System.out.println("Access Granted");
        }
    }

