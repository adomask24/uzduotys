
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
    }
    
    public void addNumber(int number){
        amountOfNumbers++;
        sum=sum+number;
    }
    public int amountOfNumbers(){
        return amountOfNumbers;
    }
    public int sum(){
        return sum;
    }
    public double average(){
        double av=(double)sum/amountOfNumbers;
        if (av>0) {
           return av; 
        } else {
            return 0;
        }
        
    }
   
}
