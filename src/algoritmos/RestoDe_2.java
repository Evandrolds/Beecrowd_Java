package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class RestoDe_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10000; i++) {

            if (i % n == 2) {

                System.out.printf("%d\n", i);
            }
        }
    }
}
