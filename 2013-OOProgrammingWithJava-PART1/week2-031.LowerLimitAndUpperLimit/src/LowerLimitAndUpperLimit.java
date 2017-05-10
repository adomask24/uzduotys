
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Last");
        int b = Integer.parseInt(reader.nextLine());
        
        
        while (a<=b) {
            System.out.println(a);
            a++;
        }
        
        

        // write your code here

    }
}
