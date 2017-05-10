
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String r = reader.nextLine();
        
        System.out.println("Length of the first part: ");
        int i = Integer.parseInt(reader.nextLine());
        
        
        String a  = r.substring(0,i);
        System.out.println("Result: " + a);
                
        
    }
}
