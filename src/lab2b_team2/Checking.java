/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2b_team2;

/**
 *
 * @author Alex
 */
public class Checking extends Accounts{
    
    public Checking(double balance, int accountNumber, int pin, Customer customer){
        super(balance, accountNumber, pin, customer);
    }
    
    @Override
    public void withdraw(double amount){
        balance = balance - amount;
    }
    
    @Override
    public void depositCurrency(double amount){
        balance = balance + amount;
    }
    
    public void depositCheck(Checks c){
        balance = balance + c.amount;
    }
    
    @Override
    public double getBalance(){
        return balance;
    }
    
    @Override
    public int getAccountNumber(){
        return accountNumber;
    }
    
    @Override
    public int getPIN(){
        return pin;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
}
