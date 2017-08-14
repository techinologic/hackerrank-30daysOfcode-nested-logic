import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        // actual return date
        int d_a = 31;
        int m_a = 12;
        int y_a = 2009;
        //int d_a = sc.nextInt();
        //int m_a = sc.nextInt();
        //int y_a = sc.nextInt();

        // expected return date
        int d_e = 1;
        int m_e = 1;
        int y_e = 2010;
        //int d_e = sc.nextInt();
        //int m_e = sc.nextInt();
        //int y_e =  sc.nextInt();

        int fine = 0;

        if (y_a < y_e) { //YEAR if less year
            fine = 0;
        } else if (y_a == y_e) { // if same year
            if (m_a <= m_e) { //MONTH  6 <= 7
                if (d_a <= d_e) { //DAY
                    fine = 0;
                } else {
                    fine += 15 * (d_a - d_e);
                }
            } else {
                fine += 500 * (m_a - m_e);
            }
        } else {
            fine = 10_000;
        }

        System.out.println(fine);
    }
}