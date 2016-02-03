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
}
