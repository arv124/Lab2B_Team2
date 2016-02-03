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
public class Commercial extends Customer {
    
    public String businessName;
    
    public Commercial(int accountNum, String businessName){
        super(accountNum);
        this.businessName = businessName;
    }
    public String getBusinessName(){
        return businessName;
    }
    @Override
    protected int getAccountNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
