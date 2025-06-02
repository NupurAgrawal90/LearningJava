import java.util.Scanner;

public class BankMenuDoWhile {

    public static void main(String[] args)
    { Scanner sc = new Scanner (System.in);
        int choice,deposit;
         int balance= 1000;

         do {
             System.out.println("Welcome to ABC bank Online service");
             System.out.println("Let us know what are you here for");
             System.out.println("choose your requirement from the below menu");
             System.out.println("1. Check account balance");
             System.out.println("2. Cash Deposit");
             System.out.println("3. Cash Withdrawal");
             System.out.println("4. Exit");
             choice = sc.nextInt();


             switch (choice) {
                 case 1:
                     System.out.println("your current balance is  "+balance);
                     break;
                 case 2:
                     System.out.println("Enter the amount you want to deposit");
                     deposit = sc.nextInt();
                     balance +=deposit;
                     System.out.println("your updated balance is "+balance);
                     break;
                 case 3:
                     System.out.println("Enter the amount you want to withdraw");
                     int amount = sc.nextInt();
                     if(amount<=balance)
                     {
                         balance = balance - amount;

                     System.out.println("your updated balance is "+balance);
                     }
                     else
                     {
                         System.out.println("insufficient balance");
                     }
                     break;
                 default:
                     System.out.println("Invalid choice");
             }





         } while (choice!=4);



    }


}