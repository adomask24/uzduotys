public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 1;
        while (i<=amount) {
            System.out.print("*");
            i++;    
        } 
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 1;
        while (i<= amount) {
            System.out.print(" ");
            i++;
        }
        
    }

    public static void printTriangle(int size) {
        int i = 1;
        while(i<= size ) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int c = 1;
        while (i<height+1){
            printWhitespaces(height - i);
            printStars(c);
            i++;
            c=c+2;
        }
        int b=1;
        while (b<=2) {
        printWhitespaces(height-2);
        printStars(3);
        b++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
