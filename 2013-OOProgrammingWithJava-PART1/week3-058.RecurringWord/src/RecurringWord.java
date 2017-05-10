
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String r = reader.nextLine();
        
        while (!words.contains(r)) {
            words.add(r);
            System.out.println("Type a word: ");
            r = reader.nextLine();   
        }
        System.out.println("You gave the word " + r +" twice");
        
    }
}
