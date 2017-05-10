import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String r = reader.nextLine();
        lastCharacter(r);
        System.out.println("Last character: " + lastCharacter(r));
        
        
    }
    
    public static char lastCharacter(String text){
        char l = text.charAt(text.length()-1);
        return l;
    }
}
