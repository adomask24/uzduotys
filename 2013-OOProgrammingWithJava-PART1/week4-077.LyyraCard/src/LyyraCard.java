/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adomas
 */
public class LyyraCard {
    
     private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance=balanceAtStart;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }
    
    public void payEconomical() {
    if (balance-2.5>=0){
        balance=balance-2.50;
    }
}

public void payGourmet() {
    if(balance-4.00>=0){
    balance=balance-4.00;
    }
}
public void loadMoney(double amount) {
    
    if (amount>0){
    
    if (balance+amount<=150) {
        balance=balance+amount;
    }else {
        this.balance=150;
    }
    }
}
}



