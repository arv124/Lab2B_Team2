/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b_team2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author arv124
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Checking> checkingAccounts=new ArrayList<Checking>();
        ArrayList <Savings> savingsAccounts=new ArrayList<Savings>();
        
        Scanner in=new Scanner (System.in);
        
        System.out.println("Enter Account number");
        int accountNumber=in.nextInt();
        char accountType='x';
        for(int i=0; i<checkingAccounts.size();i++)
        {
            if(accountNumber==(checkingAccounts.get(i).getAccountNumber()))
            {
                accountType='c';
                accountNumber=i;
            }
        }
        for(int i=0; i<savingsAccounts.size(); i++)
        {
            if(accountNumber==(savingsAccounts.get(i).getAccountNumber()))
            {
                accountType='s';
                accountNumber=i;
            }
        }
        //////////////////////////////////////////////////////////////////////////if accoun number is not found, loop to beginning
        if(accountType=='c')
        {
            System.out.println("Enter PIN");
            int pin=in.nextInt();
            if(pin==checkingAccounts.get(accountNumber).getPIN())
            {
                System.out.println("Enter w to withdraw. \n"
                        + "Enter d to make a deposit. \n"
                        + "Enter b to get your balance." );
                char command=in.next().charAt(0);
                if(command=='w')
                {
                    System.out.println("Enter amount to withdraw");
                    double withdraw=in.nextDouble();
                    checkingAccounts.get(accountNumber).withdraw(withdraw);
                    double balance=checkingAccounts.get(accountNumber).getBalance();
                    if(balance<0)
                    {
                        checkingAccounts.get(accountNumber).depositCurrency(withdraw);
                        System.out.println("Withdraw amount exceeds balance. Withdraw unsuccessful.");
                    }
                    System.out.println("Your balance is now: $"+balance);
                }
                else if (command=='d')
                {
                    System.out.println("Enter amount to deposit");
                    double deposit=in.nextDouble();
                    checkingAccounts.get(accountNumber).depositCurrency(deposit);
                    double balance=checkingAccounts.get(accountNumber).getBalance();
                    System.out.println("Your Balance is now: $"+balance);
                }
                else if (command=='b')
                {
                    double balance=checkingAccounts.get(accountNumber).getBalance();
                    System.out.println("Your balance is : $"+balance);
                }
                else
                {
                    System.out.println("invalid command");////////////////////////loop to the begining
                }

            }
        }
        if(accountType=='s')
        {
            System.out.println("Enter PIN");
            int pin=in.nextInt();
            if(pin==savingsAccounts.get(accountNumber).getPIN())
            {
                System.out.println("Enter w to withdraw. \n"
                        + "Enter d to make a deposit. \n"
                        + "Enter b to get your balance." );
                char command=in.next().charAt(0);
                if(command=='w')
                {
                    System.out.println("Enter amount to withdraw");
                    double withdraw=in.nextDouble();
                    savingsAccounts.get(accountNumber).withdraw(withdraw);
                    double balance=savingsAccounts.get(accountNumber).getBalance();
                    if(balance<0)
                    {
                        savingsAccounts.get(accountNumber).depositCurrency(withdraw);
                        System.out.println("Withdraw amount exceeds balance. Withdraw unsuccessful.");
                    }
                    System.out.println("Your balance is now: $"+balance);
                }
                else if (command=='d')
                {
                    System.out.println("Enter amount to deposit");
                    double deposit=in.nextDouble();
                    savingsAccounts.get(accountNumber).depositCurrency(deposit);
                    double balance=savingsAccounts.get(accountNumber).getBalance();
                    System.out.println("Your Balance is now: $"+balance);
                }
                else if (command=='b')
                {
                    double balance=savingsAccounts.get(accountNumber).getBalance();
                    System.out.println("Your balance is : $"+balance);
                }
                else
                {
                    System.out.println("invalid command");////////////////////////loop to the begining
                }

            }
        }
        //what would you like to 
        //
    }
    
}
