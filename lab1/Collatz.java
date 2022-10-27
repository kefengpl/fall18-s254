/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Returns the nextNumber in a Collatz sequence. */
    public static int nextNumber(int n) {
        /** If the number n is odd, then return 3n+1
         *  n is even,then return n/2
         */
        if(n%2==0) {
            return n/2;   //even number will be divided by 2
        }
        else {
            return 3*n+1;
        }
    }

    public static void main(String[] args) {
        int n = 72;
        System.out.print(n + " ");
        char a='a';
        // Some starter code to test
        while (n != 1) {          
            n = nextNumber(n);          
            System.out.print(n + " ");
        }
        System.out.println();

    }
}