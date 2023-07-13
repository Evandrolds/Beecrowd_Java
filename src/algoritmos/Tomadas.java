package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Tomadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        int total = 0;
        for (int i = 1; i <= 4; i++) {
           T= sc.nextInt();
            total += T;
        }
        System.out.println(total -3);
    }
}
