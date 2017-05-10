
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type first number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type second number: ");
        int b = Integer.parseInt(reader.nextLine());
        System.out.println("Type third number: ");
        int c = Integer.parseInt(reader.nextLine());
        
        
       
        int read; 
        int sum = a+b+c;

        System.out.println("Sum: " + sum);
    }
}
