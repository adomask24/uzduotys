/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adomas
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit=upperLimit;
    }

    public void next() {
        
        if (value>=upperLimit){
            value=0;
        } else if (value<upperLimit){
            value++;
        }
    }
    public String toString() {
        if (value<10) {
            return "0"+value;
        } else {
        return ""+value;}
    }
    public int getValue() {
        return value;
    }
    public void setValue(int newValue){
        if (newValue >0 && newValue<=upperLimit){
           value=newValue;
        } else {
            value=0;
        }
        
    }
}



