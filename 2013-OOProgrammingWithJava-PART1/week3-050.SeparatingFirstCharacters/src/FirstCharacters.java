import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String r = reader.nextLine();
        if (r.length()>3) {
            System.out.println("1. character: " + r.charAt(0));
            System.out.println("2. character: " + r.charAt(1));
            System.out.println("3. character: " + r.charAt(2));
        } else {
            System.out.println("");
        }
        
        
        
        
        
        
    }
}
