
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String a = reader.nextLine();
        System.out.println("Type the second word: ");
        String b = reader.nextLine();
        
        int index  = a.indexOf(b);
        
        
        if (index ==-1) {
        System.out.println("The word '" + b + "' is not found in the word '" + a +"'");
            
        } else {
        System.out.println("The word '" + b + "' is found in the word '" + a +"'");
        }  
    }
}
