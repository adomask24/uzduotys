
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius:");
        int a = Integer.parseInt(reader.nextLine());
        double circ = 2*Math.PI * a;
        System.out.println("Circumference of the circle: "+ circ);
        
        

        // Program your solution here 
    }
}
