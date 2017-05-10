
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        
        String password = "carrot";
        Scanner s1 = new Scanner(System.in);
        System.out.println("Type the password:");
        String r1 = s1.nextLine();
        
        while ( !r1.equals(password) ) {
            System.out.println("Wrong!");
            System.out.println("Type the password:");
            r1 = s1.nextLine();
       
        }
        System.out.println("Right!");
        System.out.println("The secret is: jryy qbar!");
   
           }
           
       
    }
      
        
               
        

