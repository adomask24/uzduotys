
public class Accounts {

    public static void main(String[] args) {
     
       Account  mattsAccount= new Account("Matt's account",1000.0);
       Account  myAccount= new Account("My account",0);
       mattsAccount.withdrawal(100.00);
       myAccount.deposit(100.00);
       System.out.println(mattsAccount);
       System.out.println(myAccount);







    }

}
