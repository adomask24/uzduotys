import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides=numberOfSides;
    }

    public int roll() {
       int i = random.nextInt((numberOfSides - 1) + 1) + 1;
        // create here a random number belongig to range 1-numberOfSided
        return i;
    }
}
