package main;
import java.util.*;
public class Account {
    // p amount - principal, accno=account no
     // we need variable to see how much money is account save that in pamount


    long pamount,invest,accno;
    String name;
    public static void main(String[] args) 
    {
         Scanner scan=new Scanner(System.in);
  //switch case
//    1. add account
//    2.check balance
       System.out.println("WELCOME TO OUR APP");
       System.out.println("choose:  1. add account\n 2.check balance");
       int choice=scan.nextInt();

       //obj

       Account obj=new Account();
       switch(choice)
       {
        case 1:
       obj.addaccount();
        break;
        case 2:
       obj. checkbalance();
        break;
       }

    }


    void checkbalance()
     {
    }

    void addaccount()
     {

    }
}




