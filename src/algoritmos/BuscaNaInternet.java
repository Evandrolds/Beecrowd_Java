package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class BuscaNaInternet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= t; i++) {
            total ++;
        }
       System.out.printf("%d\n", total*4);
    }
}
