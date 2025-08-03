import java.util.*;
import java.lang.*;

class SumoftwoNo {
    static Scanner input = new Scanner(System.in);

    public static int read() {
        return input.nextInt();
    }

    public static void main(String args[]) {

        Integer a, b, c;
        
        System.out.println("Enter two no ");
        a = read();
        b = read();
        
        c = a + b;
        System.out.println("Sum is " + c);
    }
}