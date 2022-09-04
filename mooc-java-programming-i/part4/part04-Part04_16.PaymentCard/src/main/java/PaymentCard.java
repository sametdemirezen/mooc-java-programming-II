/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samet
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably(){
        if (balance >= 2.60) {
            this.balance = this.balance - 2.60;
        } else {
            
        }
        
    }
    
    public void eatHeartily(){
       if (balance >= 4.60){
           this.balance = this.balance - 4.60;
       } else{
           
       }
    }
    public void addMoney(double money){
        if (money > 0) {
            if (balance <= 150 && balance + money >= 150){
                balance = 150.0;
            } else {
                balance = balance + money;
            }
        } else {
            
        }
    } 
}
