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
        boolean accountExists=false;
        for(int i=0; i<checkingAccounts.size();i++)
        {
            if(accountNumber==(checkingAccounts.get(i).getAccountNumber()))
            {
                accountType='c';
                accountNumber=i;
                accountExists=true;
            }
        }
        for(int i=0; i<savingsAccounts.size(); i++)
        {
            if(accountNumber==(savingsAccounts.get(i).getAccountNumber()))
            {
                accountType='s';
                accountNumber=i;
                accountExists=true;
            }
        }
        //////////////////////////////////////////////////////////////////////////if accoun number is not found, loop to beginning
        if(accountExists==true)
        {
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
        }
        else
        {
            System.out.println("Create Account");
            System.out.println("Enter p for personal account or c for commercial account.");
            char customerType=in.next().charAt(0);
            Personal newPersonalCustomer=new Personal(0,"unknown first name", "unknownLastName");
            Commercial newCommercialCustomer=new Commercial(0,"unknown Business Name");
            if(customerType=='p')
            {
                System.out.println("Enter first name:");
                String firstName=in.next();
                System.out.println("Enter last name:");
                String lastName=in.next();
                newPersonalCustomer = new Personal(0, firstName, lastName);
                System.out.println("Enter c for checking account or s for savings account.");
                accountType=in.next().charAt(0);
                System.out.println("Enter PIN");
                int pin=in.nextInt();
                if (accountType=='c')
                {
                    newPersonalCustomer.setAccountNumber(checkingAccounts.size()+1);
                    Checking newAccount=new Checking (0.0,(checkingAccounts.size()+1),pin,newPersonalCustomer);
                    checkingAccounts.add(newAccount);
                }
                else if (accountType=='s')
                {
                    newPersonalCustomer.setAccountNumber(savingsAccounts.size()+1);
                    Savings newAccount=new Savings(0.0,(savingsAccounts.size()+1),pin,newPersonalCustomer,.01);
                    savingsAccounts.add(newAccount);
                }
            }
            else if(customerType=='c')
            {
                System.out.println("Enter buisness name: ");
                String buisnessName=in.nextLine();
                newCommercialCustomer=new Commercial(0, buisnessName);
                System.out.println("Enter c for checking account or s for savings account.");
                accountType=in.next().charAt(0);
                System.out.println("Enter PIN");
                int pin=in.nextInt();
                if (accountType=='c')
                {
                    newCommercialCustomer.setAccountNumber(checkingAccounts.size()+1);
                    Checking newAccount=new Checking (0.0,(checkingAccounts.size()+1),pin,newPersonalCustomer);
                    checkingAccounts.add(newAccount);
                }
                else if (accountType=='s')
                {
                    newCommercialCustomer.setAccountNumber(savingsAccounts.size()+1);
                    Savings newAccount=new Savings(0.0,(savingsAccounts.size()+1),pin,newCommercialCustomer,.01);
                    savingsAccounts.add(newAccount);
                }                
            }
        }

    
    
    }}
