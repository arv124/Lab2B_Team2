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
public class Savings extends Accounts{
    
    public double interest;
    
    public Savings(double balance, int accountNumber, int pin, Customer customer, double interest){
        super(balance, accountNumber, pin, customer);
        this.interest = interest;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    @Override
    public void depositCurrency(double amount) {
        balance = balance + amount;
    }
    
    public void compoundInterest(){
        balance = balance*(1+interest);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public int getPIN() {
        return pin;
    }
    
    public double getInterest(){
        return interest;
    }
    
}
