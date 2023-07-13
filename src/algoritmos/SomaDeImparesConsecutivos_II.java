package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class SomaDeImparesConsecutivos_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 0, x = 0;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
          int soma = 0;
            if (x > y) {
                for (int j = x-1; j > y; j--) {
                    if (j % 2 != 0) soma += j;
                }
            } else if (x < y) {
                for (int j = x+1; j < y; j++) {
                    if (j % 2 != 0) soma += j;
                }
            }
            System.out.println(soma);
        }
    }
}
