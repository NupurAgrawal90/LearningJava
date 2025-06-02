package nupurlearning.com;

import java.sql.SQLOutput;

public class BankAccount {

    String holderName;
    int acntNum;
    double acntBal;

//    public void setDetails(String name,int accNo, double balance)
//    {
//        holderName = name;
//        acntNum = accNo;
//        acntBal = balance;
//    }
//
//    public void showDetails()
//    {
//        System.out.println("Account Details");
//        System.out.println("Name: "+holderName);
//        System.out.println("Account Number: "+acntNum);
//        System.out.println("Bank Balance: Rs "+acntBal);
//
//    }
//
//    public static void main(String[] args)
//    {
//        BankAccount a1 = new BankAccount();
//        BankAccount a2 = new BankAccount();
//
//        a1.setDetails("Nupur",12345,890980);
//        a2.setDetails("Pawan",123456,9999999);
//
//        a1.showDetails();
//        a2.showDetails();


    public BankAccount(String name,int accNo, double balance)
    {
        holderName = name;
        acntNum = accNo;
        acntBal = balance;
    }

    public void showDetails() {
        System.out.println("Account Details");
        System.out.println("Name: " + holderName);
        System.out.println("Account Number: " + acntNum);
        System.out.println("Bank Balance: Rs " + acntBal);
    }

    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount("pawan",1,12345);
        a1.showDetails();


    }

}
