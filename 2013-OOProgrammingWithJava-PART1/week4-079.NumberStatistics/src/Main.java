import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics evenSum = new NumberStatistics();
        NumberStatistics oddSum = new NumberStatistics();

        System.out.println("Type numbers:");
        int a = Integer.parseInt(reader.nextLine());
        while (a!=-1) {
            sum.addNumber(a);
            if (a%2==0) {
                evenSum.addNumber(a);
            } else {
                oddSum.addNumber(a);
            }
            a = Integer.parseInt(reader.nextLine());
        } 
        System.out.println("Sum: "+sum.sum());
        System.out.println("Sum of even: "+evenSum.sum());
        System.out.println("Sum of odd: "+oddSum.sum());
     
        

    }
}
