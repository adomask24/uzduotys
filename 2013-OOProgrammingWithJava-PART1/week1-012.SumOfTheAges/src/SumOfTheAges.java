
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String vardas1 = reader.nextLine();
        System.out.println("Type your age: ");
        int age1 = Integer.parseInt(reader.nextLine());
        System.out.println();
        System.out.println("Type your name: ");
        String vardas2 = reader.nextLine();
        System.out.println("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());
        int sum = age1+age2;
        System.out.println(vardas1+" and "+vardas2+" are " +sum+" old in total.");
        
        
        
        
        
        

        // Implement your program here
    }
}
