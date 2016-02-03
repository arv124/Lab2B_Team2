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

public class Currency {
    
    // coins
    final private double PENNY = 0.01;
    final private double NICKEL = 0.05;
    final private double DIME = 0.10;
    final private double QUARTER = 0.25;
    //bills (Clinton, Cosby, Nye etc.)
    final private double ONE = 1.00;
    final private double FIVE = 5.00;
    final private double TEN = 10.00;
    final private double TWENTY = 20.00;
    final private double FIFTY = 50.00;
    final private double HUNDRED = 100.00;
    
    public Currency ()
    {
        
    }
    
    public double getPenny()
    {
    return PENNY;
    }
    
    public double getNickel()
    {
    return NICKEL;
    }
    
    public double getDime()
    {
    return DIME;
    }
    
    public double getQuarter()
    {
    return QUARTER;
    }
    
    public double getOne()
    {
    return ONE;
    }
    
    public double getFive()
    {
        return FIVE;
    }
    
    public double getTen()
    {
    return TEN;
    }
    
    public double getTwenty()
    {
    return TWENTY;
    }
    
    public double getFifty()
    {
    return FIFTY;
    }
    
    public double getHundred()
    {
    return HUNDRED;
    }
    
        //bills (Clinton, Cosby, Nye etc.)
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
}
