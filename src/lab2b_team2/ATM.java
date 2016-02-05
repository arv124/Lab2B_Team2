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
    public Currency c;
    
    public void authenticatePIN(int accountPin, Checking c){
        this.accountPin = accountPin;
        if(accountPin == c.getPIN()){
            System.out.println("You have been authenticated!");
        }
    }
    public String vendBill(double amountVending){
        double one = (amountVending%5);
        double five = (amountVending%5);
        double ten = (amountVending%10);
        double twenty = (amountVending%20);
        double fifty = (amountVending%50);
        double hundred = (amountVending%100);
        
        if(amountVending % 10 == 0){
            if(amountVending % 100 != 0){
                amountVending = amountVending - ((amountVending%100)*100);
            }
            if(amountVending % 50 != 0){
                
                amountVending = amountVending - ((amountVending%50)*50);
            }
            if(amountVending % 20 != 0){
                
                amountVending = amountVending - ((amountVending%20)*20);
            }
            if(amountVending % 10 != 0){
                
                amountVending = amountVending - ((amountVending%10)*10);
            }
            if(amountVending % 5 != 0){
                five = (amountVending%5);
                amountVending = amountVending - ((amountVending%5)*5);
            }
            if(amountVending % 1 != 0){
                amountVending = amountVending - ((amountVending%1)*1);
            }
        }
        String str = "Hundred: "+hundred+"\nFifty: "+fifty+"\nTwenty: "+twenty+"\nTen: "+ten+"\nFive: "+five+"\nOne: "+one;
        return str;
    }
    // should this method be double instead of void??
    public double getATMBalance(){
        return atmBalance;
    }
    /*
    public double convert(double atmBalance, Currency c){
        this.atmBalance = atmBalance;
        atmBalance = rateOfExchange * atmBalance;
        return atmBalance;
    }
    */
           
}
