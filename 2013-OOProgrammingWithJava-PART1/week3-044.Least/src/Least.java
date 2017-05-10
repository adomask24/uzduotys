
public class Least {

    public static int least(int number1, int number2) {
        int least;
        if (number1>number2) {
            least=number2;
        } else if (number2>number1){
            least=number1;
        } else {
            least=number1;
        }
        
        return least;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
