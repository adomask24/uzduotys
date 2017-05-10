
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String r = reader.nextLine();
        calculateCharacters(r);
        System.out.println("Number of characters: " + calculateCharacters(r));
        
        
    }
    
    public static int calculateCharacters(String r){
    return r.length();
        
    }
    // do here the method
    // public static int calculateCharacters(String text)
   
}
