
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        double a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another nummber:");
        double b = Integer.parseInt(reader.nextLine());
        double div = a/b;
        System.out.println("Division: "+a+" / "+b+" = "+div);

        // Implement your program here. Remember to ask the input from user.
    }
}
