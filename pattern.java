import java.util.*;

public class pattern {

    static void printPattern(int n) {
        for (int i = 0, space = (2 * n) + n, m = 1; i < n; i++, space -= 3) {
            for (int k = 0; k < (space + 2); k++) {
                System.out.print(" ");
            }

            m += (i % 2 != 0) ? (n - 1) : 0;

            for (int j = 0; j < n; j++) {
                System.out.print(m + " " + ((m < 10) ? " " : ""));
                m += (i % 2 != 0) ? -1 : 1;
            }

            m += (i % 2 != 0) ? (n + 1) : 0;

            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int n = 7;

        printPattern(n);
    }
}