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
public class Personal extends Customer {
    public String firstName;
    public String lastName;
    
    public Personal(int accountNum, String firstName, String lastName){
        super(accountNum);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    @Override
    public int getAccountNumber(){
        return accountNum;
    }
}
