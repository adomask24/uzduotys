
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number:");
        int a = Integer.parseInt(reader.nextLine());
        int b = 1;
        while (a!=numberDrawn){
            
            if (a< numberDrawn){
            System.out.println("The number is greater, guesses made: " + b);
            
                    } else if (a>numberDrawn) {
            System.out.println("The number is lesser, guesses made: " + b);
            
        }
        b++;    
        a = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Congratulations, your guess is correct!");
    }


    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
