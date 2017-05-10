import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word: ");
        String s = reader.nextLine();
        
        while (!s.isEmpty()) {
          words.add(s);
          System.out.println("Type a word: ");
          s=reader.nextLine(); 
          
        } 
         System.out.println("You typed the following words: ");
         System.out.println(words);
        
        
    }
}
