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
public abstract class Customer {
    protected int accountNum;
    
    public Customer(int accountNum){
        this.accountNum = accountNum;
    }
    
    protected abstract int getAccountNumber();
    public void setAccountNumber(int newAccounNumber){
        this.accountNum=newAccounNumber;
    }
}
