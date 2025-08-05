import java.util.*;
public class avg {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);


        double no, sum = 0, avg, min = 99999994, max = -99999999;
        int n;

        System.out.println("how many no you want to enter");
        n = in.nextInt();
        for (int i = 0; i <= n; ++i) {
            System.out.print("Enter the no: ");

            no = in.nextDouble();
            if (no>max) {
                max=no;
            }
            if (no<min) {
                min=no;
            }
            sum += no;
            
        }

        avg = sum/n;
        System.out.println("\nmin max "+ min+"  "+max );
        System.out.println("Avg of " + n + "number is "+ avg);
    }
    
}
