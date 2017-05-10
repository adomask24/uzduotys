import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String r = reader.nextLine();
        firstCharacter(r);
        System.out.println("First character: " + firstCharacter(r));
     
    }
    
    public static char firstCharacter(String text) {
        char a = text.charAt(0);
        return a;
    }
}
