import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String w = reader.nextLine();
        System.out.println("Length of the end part: ");
        int i = Integer.parseInt(reader.nextLine());
        int l = w.length();
        String a = w.substring(l-i);
        System.out.println("Result: " +a );
    }
}
