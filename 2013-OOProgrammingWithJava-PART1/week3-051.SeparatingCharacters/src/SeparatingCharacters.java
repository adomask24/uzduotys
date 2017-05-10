
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String r = reader.nextLine();
        int a = r.length();
        int i = 0;
        int b = 1;
               
        while (i<r.length()) {
            char c = r.charAt(i);
            System.out.println(b + ". character: " + c);
            i++;
            b++;
        }
        
    }
}
