import java.util.Random;


public class PasswordRandomizer {
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length=length;
        
    }
    public String createPassword() {
        
        String b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String a=b.toLowerCase();
        random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<length;i++){
            
                sb.append(a.charAt(random.nextInt(a.length())));
        }
       
       
        return sb.toString();
        
    }
}
