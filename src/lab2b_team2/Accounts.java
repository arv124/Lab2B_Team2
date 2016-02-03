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
public abstract class Accounts {
    
    protected double balance = 0;
    protected int accountNumber;
    protected int pin;
    protected Customer customer;
    
    public Accounts(double balance, int accountNumber, int pin, Customer customer){ 
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.customer = customer;
    }
    
    protected abstract void withdraw(double amount);
    
    protected abstract void depositCurrency(double amount);
    
    protected abstract double getBalance();
    
    protected abstract int getAccountNumber();
    
    protected abstract int getPIN();
    
}
