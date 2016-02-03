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
public class Checks {
    
    public int checkNumber = 0;
    public double amount = 0;
    public int accountNumber;
    public Customer reciever;
    
    public Checks(int checkNumber, double amount, int accountNumber, Customer reciever){
        this.checkNumber = checkNumber;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.reciever = reciever;
    }
    
    public int getCheckNumber(){
        return this.checkNumber;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public Customer getCustomer(){
        return this.reciever;
    }
    
}
