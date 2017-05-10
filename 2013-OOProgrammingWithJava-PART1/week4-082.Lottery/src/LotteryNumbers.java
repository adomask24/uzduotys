import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random r = new Random();
       ArrayList<String> s = new ArrayList<String>();
        this.numbers = new ArrayList<Integer>();
        numbers.add(Random());
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)){
            return true;
        }else {
            return false;
        }
        // Test here if the number is already in the drawn numbers
        
    }
}
