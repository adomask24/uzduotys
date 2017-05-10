import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int a = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i=0;
        double b=0;
        int e = 0;
        int o = 0;
        
        while (a!=-1) {
            sum=sum+a;
            i++;
            b = sum/(double)i;
            if (a%2==0) {
                e++;
            } else {
                o++;
            }
            System.out.println("Type numbers:");
            a = Integer.parseInt(reader.nextLine());
            }
        
            System.out.println("Thank you and see you later");
            System.out.println("The sum is " + sum);
            System.out.println("How many numbers: " + i);
            System.out.println("Average: " + b);
            System.out.println("Even numbers: " + e );
            System.out.println("Odd numbers: " + o );
        } 

    }

