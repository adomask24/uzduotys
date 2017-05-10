
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int l = text.length();
        
        for(int i=-1; i<l; i--){
            char ch = text.charAt(text.length()+i);
            System.out.print(ch); 
            
            
            
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return "";
            }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
