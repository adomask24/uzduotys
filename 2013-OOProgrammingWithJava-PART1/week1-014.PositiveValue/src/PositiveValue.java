
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s;
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        if (a>0) {
            s = "positive";
        } else {
            s = "is not positive";
        }
        System.out.println("The number is "+s);

        // Type your program here:
    }
}
