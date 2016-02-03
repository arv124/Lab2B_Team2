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
public class ATM {
    private double atmBalance;
    private int accountPin; //not sure whether this is needed?
    
    public void authenticatePIN(int accountPin, Checking c){
        this.accountPin = accountPin;
        if(accountPin == c.getPIN()){
            System.out.println("You have been authenticated!");
        }
    }
    public void vendBill(){
        
    }
    // should this method be double instead of void??
    public double getATMBalance(){
        return atmBalance;
    }
    public double convert(double atmBalance, Currency c){
        this.atmBalance = atmBalance;
        atmBalance = rateOfExchange * atmBalance;
        return atmBalance;
    }
           
}
