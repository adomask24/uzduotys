/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adomas
 */
import java.util.ArrayList;
public class Menu {
    
    private ArrayList<String> meals;
    
    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal){
        this.meals.add(meal);
    }
    public void printMeals(){
        for (String n : meals){
            System.out.println(n);
        }
    }
    
    
    
    
    
}
