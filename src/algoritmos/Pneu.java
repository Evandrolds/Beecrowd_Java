package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Pneu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0;
        if (x <= 40 && m <= 40) {
            if (n > m) {
                x = n - m;

            } else {
                x = n - m;
            }
        }
        System.out.printf("%d\n", x);
    }
}
