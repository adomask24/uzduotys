import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String r = reader.nextLine();
        int l = r.length();
        int i = -1;
        int b = 0;
        System.out.print("In reverse order: ");
        while (b<l) {
            char c = r.charAt(r.length()+i);
            System.out.print(c);
            i--;
            b++;
            
        }
    }
}
